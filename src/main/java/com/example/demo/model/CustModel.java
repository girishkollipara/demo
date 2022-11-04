package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_data")
public class CustModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long c_id;

	@Column(name = "c_name")
	private String c_name;

	@Column(name = "c_branch")
	private String c_branch;

	@Column(name = "c_ifsc_cod")
	private String c_ifsc_cod;

	@Column(name = "c_ac_no")
	private Long c_ac_no;

	public Long getC_id() {
		return c_id;
	}

	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_branch() {
		return c_branch;
	}

	public void setC_branch(String c_branch) {
		this.c_branch = c_branch;
	}

	public String getC_ifsc_cod() {
		return c_ifsc_cod;
	}

	public void setC_ifsc_cod(String c_ifsc_cod) {
		this.c_ifsc_cod = c_ifsc_cod;
	}

	public Long getC_ac_no() {
		return c_ac_no;
	}

	public void setC_ac_no(Long c_ac_no) {
		this.c_ac_no = c_ac_no;
	}

	@Override
	public String toString() {
		return "CustModel [c_id=" + c_id + ", c_name=" + c_name + ", c_branch=" + c_branch + ", c_ifsc_cod="
				+ c_ifsc_cod + ", c_ac_no=" + c_ac_no + "]";
	}

	

	

	
	

}
