package com.example.mescommon.filter;

import com.example.mescommon.entity.Token;
import com.example.mescommon.utils.TokenGenerator;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Set;

@Slf4j
@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private static final Set<String> WHITE_PATHS =
            Set.of("/auth/login", "/auth/register");

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 白名单接口不验证token
        log.info("request path: " + request.getServletPath());
        if(WHITE_PATHS.contains(request.getServletPath())){
            filterChain.doFilter(request, response);
            return;
        }

        try {
            // 1.获取请求头中的token
            String authorization = request.getHeader("Authorization");

            // 2.校验token是否存在
            if (authorization == null || !authorization.startsWith("Bearer ")) {
                filterChain.doFilter(request, response);
                return;
            }

            // 3.解析token
            Token token = TokenGenerator.parseToken(authorization.replace("Bearer ", ""));

            // 4.把token的用户数据存入SecurityContext
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(token.getId(), null, null);
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        } catch (Exception err) {
            log.error("解析token失败");
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            return;
        }

        // 5.继续执行后续的filter链
        filterChain.doFilter(request, response);
    }
}
