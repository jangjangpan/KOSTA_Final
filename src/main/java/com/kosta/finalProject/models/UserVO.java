package com.kosta.finalProject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "USER_TB")
public class UserVO {

	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	String userid;
	
	@Column(name="USER_PASSWORD")
	String userpw;

	@Column(name="USER_NAME", nullable = true)
	String username;
	
	String nickname;

	@Column(name="USER_ADDRESS", nullable = true)
	String useraddress;
	@Column(name="USER_PHONE", unique = true, nullable = false)
	String userphone;
	@Column(name="USER_EMAIL", nullable = true)
	String useremail;
	@Column(name="USER_PHONE", nullable = true)
	String userphoto;
	
	//@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, )
	
	
}
