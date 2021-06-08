package com.kosta.finalProject.models;

import java.io.Serializable;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ExerciseTypeRefVOId implements Serializable{
	
	int center;
	int etype;
}
