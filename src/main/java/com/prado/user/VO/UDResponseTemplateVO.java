package com.prado.user.VO;

import com.prado.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UDResponseTemplateVO {
	private User user;
	private Department department;
}
