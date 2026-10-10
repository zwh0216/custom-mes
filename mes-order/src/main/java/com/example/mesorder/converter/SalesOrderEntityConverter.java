package com.example.mesorder.converter;


import com.example.mesorder.dto.InsertSalesOrderDto;
import com.example.mesorder.entity.SalesOrderEntity;

public class SalesOrderEntityConverter {
    public static SalesOrderEntity toEntity(InsertSalesOrderDto insertSalesOrderDto) {
        SalesOrderEntity salesOrderEntity = new SalesOrderEntity();
        salesOrderEntity.setContractCode(insertSalesOrderDto.getContractCode());
        salesOrderEntity.setAmount(insertSalesOrderDto.getAmount());
        salesOrderEntity.setCreatorId(insertSalesOrderDto.getCreatorId());
        salesOrderEntity.setProdId(insertSalesOrderDto.getProdId());
        salesOrderEntity.setCustomerName(insertSalesOrderDto.getCustomerName());
        salesOrderEntity.setDeadline(insertSalesOrderDto.getDeadline());
        return salesOrderEntity;
    }
}
