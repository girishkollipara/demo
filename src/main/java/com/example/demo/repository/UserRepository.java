package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
	@Query(value="select * from Snad_Employee where first_name=?1", nativeQuery = true)
    List<UserModel> findByEmployyeName(String name);

	

	

}