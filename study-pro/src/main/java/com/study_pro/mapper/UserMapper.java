package com.study_pro.mapper;

import entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper     //@MapperSca()  取其一
public interface UserMapper {

    List<User> getUserAll();
}
