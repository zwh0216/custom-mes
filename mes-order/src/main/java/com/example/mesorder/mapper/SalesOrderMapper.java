package com.example.mesorder.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mesorder.dto.SalesOrderQueryDto;
import com.example.mesorder.entity.SalesOrderEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalesOrderMapper extends BaseMapper<SalesOrderEntity> {
    List<SalesOrderEntity> findSalesOrderListByStatus(SalesOrderQueryDto query);
}
