package com.huawangxin.entity;

import java.util.List;

import com.huawangxin.annotation.Mapper;

@Mapper
public interface EmpMapper {
	void addEmp(Emp emp);
	void deleteEmp(Emp emp);
	void updateEmp(Emp emp);
	Emp findEmpById(Integer empno);
	List<Emp> findEmpByName(String name);
	List<Emp> findAllEmp();
}




