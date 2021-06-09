package com.kosta.finalProject.persistences;

import org.springframework.data.repository.CrudRepository;

import com.kosta.finalProject.models.CurriculumRegisterVO;
import com.kosta.finalProject.models.CurriculumRegisterVOId;

public interface CurriculumRegisterRepository extends CrudRepository<CurriculumRegisterVO, CurriculumRegisterVOId>{

}
