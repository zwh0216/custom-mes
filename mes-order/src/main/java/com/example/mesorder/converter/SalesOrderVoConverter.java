package com.example.mesorder.converter;


import com.example.mesorder.entity.SalesOrderEntity;
import com.example.mesorder.vo.SalesOrderVo;

public class SalesOrderVoConverter {
    public static SalesOrderVo toVo(SalesOrderEntity salesOrderEntity) {
        SalesOrderVo salesOrderVo = new SalesOrderVo();
        salesOrderVo.setId(salesOrderEntity.getId().toString());
        salesOrderVo.setContractCode(salesOrderEntity.getContractCode());
        salesOrderVo.setAmount(salesOrderEntity.getAmount());
        salesOrderVo.setCreatorId(salesOrderEntity.getCreatorId().toString());
        salesOrderVo.setCreatorName(salesOrderEntity.getCreatorName());
        salesOrderVo.setProdOrderId(salesOrderEntity.getProdOrderId().toString());
        salesOrderVo.setProdId(salesOrderEntity.getProdId().toString());
        salesOrderVo.setProdName(salesOrderEntity.getProdName());
        salesOrderVo.setCustomerName(salesOrderEntity.getCustomerName());
        salesOrderVo.setCreateTime(salesOrderEntity.getCreateTime());
        salesOrderVo.setUpdateTime(salesOrderEntity.getUpdateTime());
        salesOrderVo.setVersion(salesOrderEntity.getVersion());
        salesOrderVo.setDeadline(salesOrderEntity.getDeadline());
        return salesOrderVo;
    }
}
