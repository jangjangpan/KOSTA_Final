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
@Table(name = "USER_TB")
public class UserVO {
	@Id
	@Column(name="USER_ID")
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
	@Column(name="USER_PHOTO", nullable = true)
	String userphoto;
	
	@JsonIgnore
	@OneToMany(mappedBy = "mealId.user", cascade = CascadeType.ALL)
	List<MealCerfVO> mealCerfs;
	
	@JsonIgnore
	@OneToMany(mappedBy = "exerciseId.user", cascade = CascadeType.ALL)
	List<ExerciseRecordVO> exerciseRecords;
}
