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
	String userId;
	
	@Column(name="user_password")
	String userPw;

	@Column(name="user_name", nullable = true)
	String userName;
	
	String nickName;

	@Column(name="user_address", nullable = true)
	String userAddress;
	@Column(name="user_phone", unique = true, nullable = false)
	String userPhone;
	@Column(name="user_email", nullable = true)
	String userEmail;
	@Column(name="user_photo", nullable = true)
	String userPhoto;
	
	@JsonIgnore
	@OneToMany(mappedBy = "mealId.user", cascade = CascadeType.ALL)
	List<MealCerfVO> mealCerfs;
	
	@JsonIgnore
	@OneToMany(mappedBy = "exerciseId.user", cascade = CascadeType.ALL)
	List<ExerciseRecordVO> exerciseRecords;
}
