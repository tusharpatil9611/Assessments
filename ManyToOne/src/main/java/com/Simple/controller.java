package com.Simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@Autowired
	private Batchrepo batchrepo;
	@Autowired
	private StudentRepo studentrepo;
	@RequestMapping("update")
	public boolean update() 
	{
		 try {
			 Student s1=studentrepo.findById(1).get();
			 Batch b1=batchrepo.findById(2).get();
			 s1.setBatch(b1);
			 studentrepo.save(s1);
			 return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
      @RequestMapping("add")
      public boolean add() 
      {
    	 try {
    		   Batch b1= batchrepo.findById(3).get();
    			Student student=new Student(0, "somu", 40,b1 );
    			  Batch b2=batchrepo.findById(1).get();
    			  Student s1=new Student(0, "gomu", 50, b2);
    			     studentrepo.save(student);
    			     studentrepo.save(s1);
    					return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
}
