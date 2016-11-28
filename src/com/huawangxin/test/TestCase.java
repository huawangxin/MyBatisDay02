package com.huawangxin.test;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huawangxin.dao.EmpDao;
import com.huawangxin.entity.Dept;
import com.huawangxin.entity.DeptMapper;
import com.huawangxin.entity.Emp;
import com.huawangxin.entity.EmpMapper;

public class TestCase {
	public ApplicationContext getCtx(){
		String cfg = "applicationContext.xml";
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext(cfg);
		return ctx;
	}
	//@Test
	public void testDataSource()throws Exception{
		ApplicationContext ctx = getCtx();
		DataSource ds = ctx.getBean(
				"dataSource", DataSource.class);
		System.out.println(ds);
		Connection conn = ds.getConnection();
		System.out.println(conn);
		System.out.println(conn.getMetaData()
				.getDatabaseProductName());
		conn.close();
	}
	
	//@Test
	public void testDemtMapper(){
		ApplicationContext ctx = getCtx();
		DeptMapper mapper = ctx.getBean(
				"deptMapper", DeptMapper.class);
		List<Dept> list = mapper.findAll();
		System.out.println(list); 
	}
	
	//@Test
	public void testEmpMapper(){
		ApplicationContext ctx = getCtx();
		EmpMapper mapper = ctx.getBean(
				"empMapper", EmpMapper.class);
		List<Emp> list = mapper.findAllEmp();
		System.out.println(list); 
	}
	@Test
	public void testEmpDao(){
		ApplicationContext ctx = getCtx();
		EmpDao empDao = ctx.getBean(
				"empDao", EmpDao.class);
		Emp e = empDao.add("¡ı≤‘À…", 9999,
				new Date(System.currentTimeMillis()), 
				1000.0, 10.0, 1);
		System.out.println(e); 
		List<Emp> list = empDao.findAll();
		System.out.println(list); 
	}
}