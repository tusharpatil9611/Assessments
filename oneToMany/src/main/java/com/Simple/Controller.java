package com.Simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	 @Autowired
	 BatchRepo batchrepo;
	@RequestMapping("AddData")
	public int adddata()
	{
		try {
			Batch batch=new Batch();
			batch.id=0;
			batch.batchname="nov15";
			batch.count=50;
			batch.student.add(new Student(0,"novSomu",65));
			batch.student.add(new Student(0,"novSomya",15));
			batch.student.add(new Student(0,"novgomya",75));
			batch.student.add(new Student(0,"novcomu",35));
			batchrepo.save(batch);
			return 1;
		} catch (Exception e) {
			return 0;
		}
		

	}

}
