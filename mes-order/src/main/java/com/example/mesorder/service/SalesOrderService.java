package com.example.mesorder.service;

import com.example.mesorder.dto.InsertSalesOrderDto;
import com.example.mesorder.dto.SalesOrderQueryDto;
import com.example.mesorder.vo.SalesOrderVo;

import java.util.List;

public interface SalesOrderService {

    // 通过审批条件查询销售订单
    List<SalesOrderVo> findSalesOrderListByStatus(SalesOrderQueryDto query);

    // 添加销售订单
    boolean insertSalesOrder(InsertSalesOrderDto insertSalesOrderDto);
}
