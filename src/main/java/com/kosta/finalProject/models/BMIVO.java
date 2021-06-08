package com.kosta.finalProject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BMI_TB")
public class BMIVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Seoul_district")
	String district;	
	
	float underWeight;
	float normalWeight;
	float overWeight;
	float bmiAvg;
	
}
