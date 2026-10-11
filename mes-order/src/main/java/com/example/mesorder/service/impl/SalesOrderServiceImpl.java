package com.example.mesorder.service.impl;


import com.example.mesorder.constant.ApprovalStatusEnum;
import com.example.mesorder.converter.SalesOrderEntityConverter;
import com.example.mesorder.converter.SalesOrderVoConverter;
import com.example.mesorder.dto.InsertSalesOrderDto;
import com.example.mesorder.dto.SalesOrderQueryDto;
import com.example.mesorder.entity.SalesOrderEntity;
import com.example.mesorder.mapper.SalesOrderMapper;
import com.example.mesorder.service.SalesOrderService;
import com.example.mesorder.vo.SalesOrderVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SalesOrderServiceImpl implements SalesOrderService {
    @Autowired
    SalesOrderMapper salesOrderMapper;

    @Override
    public List<SalesOrderVo> findSalesOrderListByStatus(SalesOrderQueryDto query) {
        List<SalesOrderEntity> list = salesOrderMapper.findSalesOrderListByStatus(query);

        return list.stream().map(SalesOrderVoConverter::toVo).toList();
    }

    @Override
    public SalesOrderVo insertSalesOrder(InsertSalesOrderDto insertSalesOrderDto) {
        SalesOrderEntity salesOrderEntity = SalesOrderEntityConverter.toEntity(insertSalesOrderDto);

        // 设置销售订单为待审批状态
        salesOrderEntity.setStatus(ApprovalStatusEnum.Pending);
        if(salesOrderMapper.insert(salesOrderEntity) > 0){
            return SalesOrderVoConverter.toVo(salesOrderEntity);
        }

        return null;
    }

    @Override
    public boolean deleteSalesOrder(String idStr) {
        long id = Long.parseLong(idStr);
        return salesOrderMapper.deleteById(id) > 0;
    }
}
