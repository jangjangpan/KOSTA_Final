package com.kosta.finalProject.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_TB")
public class UserVO {
	@Id
	@Column(name="user_id")
	String userid;
	
	@Column(name="user_password")
	String userpw;

	@Column(name="user_name", nullable = true)
	String username;
	
	String nickname;

	@Column(name="user_address", nullable = true)
	String useraddress;
	@Column(name="user_phone", unique = true, nullable = false)
	String userphone;
	@Column(name="user_email", nullable = true)
	String useremail;
	@Column(name="user_phone", nullable = true)
	String userphoto;
	
	@JsonIgnore
	@OneToMany(mappedBy = "mealId.user", cascade = CascadeType.ALL)
	List<MealCerfVO> mealCerfs;
}
