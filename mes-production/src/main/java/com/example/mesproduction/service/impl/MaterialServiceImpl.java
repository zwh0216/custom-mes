package com.example.mesproduction.service.impl;

import com.example.mesproduction.dto.MaterialUpdateDto;
import com.example.mesproduction.entity.Material;
import com.example.mesproduction.mapper.MaterialMapper;
import com.example.mesproduction.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    public Material getMaterialById(Integer id) {
        return materialMapper.findMaterialById(id);
    }

    public List<Material> getAllMaterial() {
        return materialMapper.findAllMaterialById();
    }

    public int insertMaterial(MaterialUpdateDto material) {

        Material materialData = new Material(material.getId(), material.getName(), material.getKey(), LocalDateTime.now(), LocalDateTime.now());

        return materialMapper.insertMaterial(materialData);
    }


    public int deleteMaterial(Integer id) {
        return materialMapper.deleteMaterial(id);
    }

    public int updateMaterial(MaterialUpdateDto material){
        return materialMapper.updateMaterial(material);
    }
}
