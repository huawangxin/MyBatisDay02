package com.huawangxin.dao;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.huawangxin.entity.Emp;

@Repository("empDao")
public class MyBatisEmpDao implements EmpDao {

	@Resource
	//是MyBatis 提供，执行Sql语句的模板类
	//执行在Mapper中定义的SQL语句
	//必须在Spring XML 文件中声明sqlSessionTemplate Bean 
	private SqlSessionTemplate sqlSessionTemplate;
	//sqlSessionTemplate 功能 SqlSession 
	public Integer add(Emp emp) {
		sqlSessionTemplate.insert("addEmp", emp);
		return emp.getEmpno();
	}
	public Emp add(String ename, Integer mgr, Date hiredate, Double sal,
			Double comm, Integer deptno) {
		Emp emp = new Emp(
				ename, mgr, hiredate, sal, comm, deptno);
		sqlSessionTemplate.insert("addEmp", emp);
		return emp;
	}

	public Emp delete(Integer empno) {
		Emp emp = sqlSessionTemplate
			.selectOne("findEmpByName", empno);
		if(emp==null)
			return null;
		sqlSessionTemplate.delete("deleteEmp",emp);
		return emp;
	}

	public void delete(Emp emp) {
		sqlSessionTemplate.delete("deleteEmp", emp);
		
	}

	public List<Emp> findAll() {
		return sqlSessionTemplate
			.selectList("findAllEmp");
	}

	public Emp findById(Integer empno) {
		return sqlSessionTemplate.selectOne(
				"findByEmpId", empno);
	}

	public void update(Emp emp) {
		sqlSessionTemplate.update("updateEmp", emp);
	}
}
