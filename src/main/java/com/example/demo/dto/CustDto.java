package com.example.demo.dto;

import com.example.demo.model.CustModel;

public class CustDto {

	 private Long c_id;
	    private String c_name;
	    private String c_branch;
	    private String c_ifsc_code;
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
		public String getC_ifsc_code() {
			return c_ifsc_code;
		}
		public void setC_ifsc_code(String c_ifsc_code) {
			this.c_ifsc_code = c_ifsc_code;
		}
		public Long getC_ac_no() {
			return c_ac_no;
		}
		public void setC_ac_no(Long c_ac_no) {
			this.c_ac_no = c_ac_no;
		}
		public static CustDto getDto(CustModel i) {
			  CustDto udt = new CustDto();
		        udt.setC_id(i.getC_id());
		        udt.setC_name(i.getC_name());
		        udt.setC_branch(i.getC_branch());
		        udt.setC_ifsc_code(i.getC_ifsc_cod());
		        udt.setC_ac_no(i.getC_ac_no());
		        return udt;
			
		
		}
		
		}