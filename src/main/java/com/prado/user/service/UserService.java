package com.prado.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prado.user.VO.Department;
import com.prado.user.VO.UDResponseTemplateVO;
import com.prado.user.entity.User;
import com.prado.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public User saveUser(User user) {
		log.info("User Service: save-user: " + user);
		return userRepository.save(user);
	}
	
	public User findUser(Long userId) {
		log.info("User Service: find-user: " + userId);
		return userRepository.findByUserId(userId);
	}
	
	public UDResponseTemplateVO findDepartmentByUserId(Long userId) {
		log.info("User Service: findUserDepartmentByUserId: " + userId);
		UDResponseTemplateVO vo = new UDResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department;
		department = restTemplate.getForObject("http://localhost:8091/departments/fetch/" + user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}
}
