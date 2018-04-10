package com.ayl.homework.v3;

import com.ayl.homework.entity.Test;
import com.ayl.homework.v3.annotation.Select;

/**
 * @author AYL    2018/4/1 22:56
 */
public interface TestMapper {
    @Select("select * from test where id = %d")
    Test selectByPrimaryKey(Integer id);
}
