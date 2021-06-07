package com.kosta.finalProject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BMI_TB")
public class BMIVO {
	@Column(name="Seoul_district")
	String district;
	
	
	float under_weight;
	float normal_weight;
	float over_weight;
	float bmi_avg;
	
}
