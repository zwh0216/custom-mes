package com.example.mesproduction.mapper;

import com.example.mesproduction.dto.MaterialUpdateDto;
import com.example.mesproduction.entity.Material;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MaterialMapper {
    @Select("SELECT * FROM raw_material WHERE id = #{id}")
    Material findMaterialById(Integer id);

    @Select("SELECT * FROM raw_material")
    List<Material> findAllMaterialById();

    @Insert("INSERT INTO raw_material (id, name, `key`, update_time, create_time) VALUES(#{id}, #{name}, #{key}, #{updateTime}, #{createTime})")
    int insertMaterial(Material material);

    @Delete("DELETE FROM raw_material WHERE id = #{id}")
    int deleteMaterial(Integer id);

    @Update("UPDATE raw_material SET name = #{name} WHERE id = #{id} ")
    int updateMaterial(MaterialUpdateDto material);

}
