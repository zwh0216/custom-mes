package com.example.mescommon.utils;

import com.example.mescommon.entity.ClaimEntity;
import com.example.mescommon.entity.Token;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


//@Component
public class TokenGenerator {
    // 生成token用的密钥
    private static final SecretKey secretKey = Keys.hmacShaKeyFor("12345678901234567890123456789012".getBytes(StandardCharsets.UTF_8));

    // 生成jwt token
    public static String generateToken(ClaimEntity claimEntity) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", claimEntity.getId());
        claims.put("userName", claimEntity.getUserName());
        claims.put("nickName", claimEntity.getNickName());
        claims.put("profilePhotoUrl", claimEntity.getProfilePhotoUrl());
        Date expirationDate = new Date(System.currentTimeMillis() + 60 * 60 * 1000);
        return Jwts.builder().signWith(TokenGenerator.secretKey).claims(claims).expiration(expirationDate).compact();
    }

    // 解析jwt token
    public static Token parseToken(String tokenStr) {
        Claims claims = Jwts.parser().verifyWith(TokenGenerator.secretKey).build().parseSignedClaims(tokenStr).getPayload();
        Token token = new Token();
        token.setId(claims.get("userId", Long.class));
        token.setUserName(claims.get("userName", String.class));
        token.setNickName(claims.get("nickName", String.class));
        token.setProfilePhotoUrl(claims.get("profilePhotoUrl", String.class));
        return token;
    }
}
