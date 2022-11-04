package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDto;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;

@Component
public class UserService {

	@Autowired
	UserRepository ur;

	public void saveMyData(UserDto userdto) {
		UserModel um = new UserModel();
		um.setId(userdto.getUser_id());
		um.setFirst_name(userdto.getFirst_name());
		um.setLast_name(userdto.getLast_name());
		um.setUsername(userdto.getUsername());
		um.setPassword(userdto.getPassword());
		um.setRole(userdto.getRole());
		ur.save(um);

	}
	public List<UserDto> getEmployeeRecords() {
        Iterable<UserModel> um = ur.findAll();   
        List<UserDto> udto = new ArrayList<UserDto>();
        for(UserModel i:um)
        {
            udto.add(UserDto.getDto(i));
        }
        return udto;
    }
	public List<UserDto> getEmployeeRecordsByname(String name) {
        Iterable<UserModel> um = ur.findByEmployyeName(name);   
        List<UserDto> udto = new ArrayList<UserDto>();
        for(UserModel i:um)
        {
            udto.add(UserDto.getDto(i));
        }
        return udto;
    }
	
}