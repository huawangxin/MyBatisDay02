package com.huawangxin.entity;

import java.util.List;
import java.util.Map;

import com.huawangxin.annotation.Mapper;

/** ʵ������CRUD���� */
@Mapper
public interface DeptMapper {

	void add(Dept dept);
	
	void delete(Dept dept);
	
	Dept findById(Integer deptno);
//
//void delete(Integer deptno);
//
	void update(Dept dept);
	
	List<Dept> findAll();
	
	//List<Dept> findByLoc(String loc);
	//���ݵص��ѯ������Ϣ, ����в����� deptno
	List<Map> findDeptInfo(String loc);
}







