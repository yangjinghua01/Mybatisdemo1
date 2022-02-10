package com.example.demo;

import com.example.demo.Mapper.YjhXmlMapper;
import com.example.demo.Mapper.yjhmapper;
import com.example.demo.Pojo.yjh;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Demo1ApplicationTests {
    @Autowired
    private yjhmapper yjhmapper;
    @Autowired
    private YjhXmlMapper yjhXmlMapper;
    @Test
    void contextLoads() {

        System.out.println(111);
    }
//
    @Test
    public void findall() {
        List<yjh> select = yjhmapper.select();
        System.out.println(select);
    }
    @Test
    public void findallxml(){
        List<yjh> yjhs = yjhXmlMapper.FindAll();
//        System.out.println(yjhs);
    }
}
