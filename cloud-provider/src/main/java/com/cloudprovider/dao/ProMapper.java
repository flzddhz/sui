package com.cloudprovider.dao;

import com.cloudprovider.entity.Test1;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProMapper {

    @Select("select * from test")
    List<Test1> getTestAll();
}
