package com.example.demo.Mapper;

import com.example.demo.Pojo.yjh;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface yjhmapper {
    @Select("select * from yjh")
    List<yjh> select();

}
