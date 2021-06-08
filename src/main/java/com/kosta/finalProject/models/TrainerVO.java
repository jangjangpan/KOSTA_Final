/*
package com.kosta.finalProject.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(of="trainerNum")
@Table(name="trainer")
@IdClass(ExerciseTypeRefVOId.class)
public class TrainerVO {
	int trainerNum;
	String trainerName;
	String trainerPhone;
	String trainerEmail;
	String trainerInfo;
	String trainerPhoto;
	
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "center",
			referencedColumnName = "center"),
		@JoinColumn(name = "etype",
			referencedColumnName = "center"),
	})
	ExerciseTypeRefVO etyperef;
}
*/