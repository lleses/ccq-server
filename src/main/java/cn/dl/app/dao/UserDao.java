package cn.dl.app.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.dl.app.entity.User;

@Mapper
public interface UserDao {

	void add(User user);
}