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

import com.example.demo.dto.ResponseWrapper;
import com.example.demo.dto.UserDto;
import com.example.demo.services.UserService;



@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping(value = "/postuserdata")
	public ResponseWrapper postUserData(@RequestBody UserDto userdto, HttpServletRequest request,
			HttpServletResponse response) {
		ResponseWrapper rw = new ResponseWrapper(true);
		try {
			userService.saveMyData(userdto);

			
		} catch (Exception e) {
			rw.setSuccess(false);
		}
		rw.setMessage("Inserted Successfully");
		return rw;
	}
	@GetMapping(value="/getUserdata")
    public ResponseWrapper getUserData(HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<UserDto> listOfEmployee = userService.getEmployeeRecords();
            rw.setData(listOfEmployee);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Employees");

        return rw;

    }
	@GetMapping(value="/getUserdataByName/{name}")
    public ResponseWrapper getUserdataByName(@PathVariable String name,HttpServletRequest request, HttpServletResponse response)
    {
        ResponseWrapper rw = new ResponseWrapper(true);
        try {
            List<UserDto> Employeedata = userService.getEmployeeRecordsByname(name);
            rw.setData(Employeedata);
        }
        catch (Exception e)
        {
            rw.setSuccess(false);
        }
        rw.setMessage("List of Employees");



       return rw;



   }
	

}
