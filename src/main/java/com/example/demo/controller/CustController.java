package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CustDto;
import com.example.demo.dto.ResponseWrapper;
import com.example.demo.services.CustService;

@RestController
public class CustController {

	@Autowired
	CustService CustService;

	@PostMapping(value = "/postCustdata")
	public ResponseWrapper postCustData(@RequestBody CustDto Custdto, HttpServletRequest request,
			HttpServletResponse response) {
		ResponseWrapper rw = new ResponseWrapper(true);
		try {
			CustService.saveMyData(Custdto);

			
		} catch (Exception e) {
			rw.setSuccess(false);
		}
		rw.setMessage("Inserted Successfully");
		return rw;
	}
	@GetMapping(value="/getCustdata")
    public ResponseWrapper getCustData(HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<CustDto> listOfCustomers = CustService.getCustomerRecords();
            rw.setData(listOfCustomers);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Customers");

        return rw;

    }
	@GetMapping(value="/getCustdataByName/{name}")
    public ResponseWrapper getCustdataByName(@PathVariable String name,HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<CustDto> listOfCustomerdata = CustService.getCustomerRecordsByBranch(name);
            rw.setData(listOfCustomerdata);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Customers By specific Name");

        return rw;

    }
	

}
