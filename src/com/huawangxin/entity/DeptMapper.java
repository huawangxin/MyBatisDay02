package com.huawangxin.entity;

import java.util.List;
import java.util.Map;

import com.huawangxin.annotation.Mapper;

/** 实体对象的CRUD操作 */
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
	//根据地点查询部门信息, 结果中不包含 deptno
	List<Map> findDeptInfo(String loc);
}







