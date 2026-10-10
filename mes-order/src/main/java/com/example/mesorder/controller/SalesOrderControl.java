package com.example.mesorder.controller;

import com.example.mescommon.entity.Result;
import com.example.mesorder.dto.SalesOrderQueryDto;
import com.example.mesorder.service.SalesOrderService;

import com.example.mesorder.vo.SalesOrderVo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales-order")
public class SalesOrderControl {
    @Autowired
    SalesOrderService salesOrderService;

    @GetMapping("/query")
    public Result<List<SalesOrderVo>> findSalesOrderListByParams(@Valid SalesOrderQueryDto query) {
        List<SalesOrderVo> list = salesOrderService.findSalesOrderListByStatus(query);
        return Result.success(list, "查询成功");
    }
}
