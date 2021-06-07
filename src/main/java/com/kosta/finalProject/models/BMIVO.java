package com.kosta.finalProject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "BMI_TB")
public class BMIVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Seoul_district")
	String district;	
	
	float under_weight;
	float normal_weight;
	float over_weight;
	float bmi_avg;
	
}
