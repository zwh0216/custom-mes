package com.example.mesproduction.service;


import com.example.mesproduction.dto.MaterialUpdateDto;
import com.example.mesproduction.entity.Material;

import java.util.List;

public interface MaterialService {
    Material getMaterialById(Integer id);

    List<Material> getAllMaterial();

    int insertMaterial(MaterialUpdateDto material);


    int deleteMaterial(Integer id);

    int updateMaterial(MaterialUpdateDto material);
}
