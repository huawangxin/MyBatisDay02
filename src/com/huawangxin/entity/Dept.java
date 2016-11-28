package com.huawangxin.entity;

import java.io.Serializable;

/** ����, ���ݿ����ǲ��ű� 
 * Department ʵ����: ʵ����������
 *            ʵ�����: ��ID, �־û��洢�Ķ���
 *            ֵ����: ��ID, �������ݵķ�װ�ʹ���
 * */
public class Dept implements Serializable {
	/** ���ű�� */
	private Integer deptno;
	private String dname;
	/** location ����λ��, �����ص� */
	private String loc; 
	
	public Dept() {
	}

	public Dept(String dname, String loc) {
		super();
		this.dname = dname;
		this.loc = loc;
	}

	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptno == null) ? 0 : deptno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		if (deptno == null) {
			if (other.deptno != null)
				return false;
		} else if (!deptno.equals(other.deptno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}









