package com.dulao.dao;

import com.dulao.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    User checkLogin(@Param("username") String username,@Param("password") String password);
}
