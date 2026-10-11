package com.example.mesorder.converter;


import com.example.mesorder.dto.InsertSalesOrderDto;
import com.example.mesorder.entity.SalesOrderEntity;

public class SalesOrderEntityConverter {
    public static SalesOrderEntity toEntity(InsertSalesOrderDto insertSalesOrderDto) {
        SalesOrderEntity salesOrderEntity = new SalesOrderEntity();
        salesOrderEntity.setContractCode(insertSalesOrderDto.getContractCode());
        salesOrderEntity.setAmount(insertSalesOrderDto.getAmount());
        salesOrderEntity.setCreatorId(Long.parseLong(insertSalesOrderDto.getCreatorId()));
        salesOrderEntity.setProdId(Long.parseLong(insertSalesOrderDto.getProdId()));
        salesOrderEntity.setCustomerName(insertSalesOrderDto.getCustomerName());
        salesOrderEntity.setDeadline(insertSalesOrderDto.getDeadline());
        return salesOrderEntity;
    }
}
