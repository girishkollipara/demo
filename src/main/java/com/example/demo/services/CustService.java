package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.CustDto;
import com.example.demo.model.CustModel;
import com.example.demo.repository.CustRepository;

@Component
public class CustService {

	@Autowired
	CustRepository cr;

	public void saveMyData(CustDto Custdto) {
		CustModel cm = new CustModel();
		cm.setC_id(Custdto.getC_id());
		cm.setC_name(Custdto.getC_name());
		cm.setC_branch(Custdto.getC_branch());
		cm.setC_ifsc_cod(Custdto.getC_ifsc_code());
		cm.setC_ac_no(Custdto.getC_ac_no());
		
		cr.save(cm);

	}

	public List<CustDto> getCustomerRecords() {
		 Iterable<CustModel> cm = cr.findAll();   //1( 2 to 100
	        List<CustDto> udto = new ArrayList<CustDto>();
	        for(CustModel i:cm)
	        {
	            udto.add(CustDto.getDto(i));
	        }
	        return udto;
		
	}

	public List<CustDto> getCustomerRecordsByBranch(String name) {
		
		 Iterable<CustModel> cm = cr.findByCustName(name); 
	        List<CustDto> udto = new ArrayList<CustDto>();
	        for(CustModel i:cm)
	        {
	            udto.add(CustDto.getDto(i));
	        }
	        return udto;
		
	}

	
}
