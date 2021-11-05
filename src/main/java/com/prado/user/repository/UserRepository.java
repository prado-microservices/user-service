package com.prado.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prado.user.VO.UDResponseTemplateVO;
import com.prado.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);

//	UDResponseTemplateVO findDepartmentByUserId(Long userId);

}
