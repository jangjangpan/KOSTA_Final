package com.kosta.finalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kosta.finalProject.models.BusinessVO;
import com.kosta.finalProject.models.CenterVO;
import com.kosta.finalProject.models.ExerciseTypeRefVO;
import com.kosta.finalProject.models.ExerciseTypeVO;
import com.kosta.finalProject.persistences.BusinessRepository;
import com.kosta.finalProject.persistences.CenterRepository;
import com.kosta.finalProject.persistences.ExerciseTypeRefRepository;
import com.kosta.finalProject.persistences.ExerciseTypeRepository;

import lombok.extern.java.Log;

@Log
@SpringBootTest
public class FirstTest {
	@Autowired 
	BusinessRepository brepository;
	@Autowired
	CenterRepository crepository;
	@Autowired
	ExerciseTypeRepository etrepository;
	@Autowired
	ExerciseTypeRefRepository etrrepository;
	
	//@Test //여러건 insert
	public void insertBusiness() {
		IntStream.range(1,101).forEach(i->{
			BusinessVO b= new BusinessVO();
			b.setBusinessId("business"+i);
			b.setBusinessPassword("bp"+i);
			b.setBusinessAddress("서울시 금천구"+i);
			b.setBusinessTitle("사업자"+i);
			b.setBusinessPhone("010-1234-56"+i);
			
			List<CenterVO> centers= new ArrayList<>();
			IntStream.range(1, 4).forEach(j->{
				CenterVO center= new CenterVO();
				center.setBusiness(b);
				center.setCenterInfo(b.getBusinessTitle()+"의 센터"+i);
				center.setCenterPreferance(4L);
				center.setCenterTitle("센터"+center.getCenterNum());
				center.setCorporateNum("12313264"+i);
				centers.add(center);
			});
			b.setCenters(centers);
			brepository.save(b);
		});
	}
	
	//@Test //운동유형 insert
	public void insertExerciseType() {
		ExerciseTypeVO et= new ExerciseTypeVO();
		et.setExerciseTypeName("수영");
		etrepository.save(et);
	}
	
	@Test
	public void insertExerciseTypeRef() {
		ExerciseTypeRefVO etr= new ExerciseTypeRefVO();
		CenterVO c= new CenterVO();
		c.setCenterNum(1);
		ExerciseTypeVO e= new ExerciseTypeVO();
		e.setExerciseTypeNum(1);
		
		etr.setCenter(c);
		etr.setEtype(e);
		etrrepository.save(etr);
	}
}
