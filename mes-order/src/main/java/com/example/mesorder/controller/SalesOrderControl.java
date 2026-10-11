package com.example.mesorder.controller;

import com.example.mescommon.entity.Result;
import com.example.mesorder.dto.InsertSalesOrderDto;
import com.example.mesorder.dto.SalesOrderQueryDto;
import com.example.mesorder.service.SalesOrderService;

import com.example.mesorder.vo.SalesOrderVo;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/sales-order")
public class SalesOrderControl {
    @Autowired
    SalesOrderService salesOrderService;

    @GetMapping("/query")
    public Result<List<SalesOrderVo>> findSalesOrderListByParams(@Valid @RequestBody SalesOrderQueryDto query) {
        List<SalesOrderVo> list = salesOrderService.findSalesOrderListByStatus(query);
        return Result.success(list, "查询成功");
    }

    @PostMapping("/add")
    public Result<SalesOrderVo> addSalesOrder(@Valid @RequestBody InsertSalesOrderDto query) {
        SalesOrderVo salesOrderVo = salesOrderService.insertSalesOrder(query);
        if (salesOrderVo != null) {
            return Result.success(salesOrderVo, "新增成功");
        }

        return Result.error("新增失败");
    }

    @DeleteMapping("/delete/{id}")
    public Result<Void> deleteSalesOrder(@PathVariable("id") String id) {
        log.error("id -> " + id);
        if (salesOrderService.deleteSalesOrder(id)) {
            return Result.success(null, "删除成功");
        }

        return Result.error("删除失败");
    }
}
