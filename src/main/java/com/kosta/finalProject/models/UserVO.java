package com.kosta.finalProject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user_TB")
public class UserVO {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ_GENERATOR")
	private String userid;
	
	@Column(name="user_password")
	private String userpw;

	@Column(name="user_name", nullable = true)
	private String username;
	
	private String nickname;

	@Column(name="user_address", nullable = true)
	private String useraddress;
	@Column(name="user_phone", unique = true, nullable = false)
	private String userphone;
	@Column(name="user_email", nullable = true)
	private String useremail;
	@Column(name="user_phone", nullable = true)
	private String userphoto;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserBodyVO body;
	
}
