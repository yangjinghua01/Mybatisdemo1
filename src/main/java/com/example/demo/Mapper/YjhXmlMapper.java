package com.example.demo.Mapper;

import com.example.demo.Pojo.yjh;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
//通过Mapper.xml的方式实现
public interface YjhXmlMapper {
    List<yjh> FindAll();
}
