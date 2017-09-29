package org.xexexexe.billboard.mongo.repo;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.xexexexe.billboard.mongo.domain.DTransaction;

@SpringBootTest
public class DTransactionRepositoryTest extends AbstractTestNGSpringContextTests {
	
	@Autowired 
	private DTransactionRepository repository;
	private Calendar cal = Calendar.getInstance();
	
	@BeforeMethod
	public void setup(){
		repository.deleteAll();
		
		DTransaction dtrans1 = new DTransaction("dchen", "456", cal, "PES2017", 131.5);
        DTransaction dtrans2 = new DTransaction("miracle", "789", cal, "INSIDE", 20.52);
        DTransaction dtrans3 = new DTransaction("dchen", "789", cal, "INSIDE", 17.65);
        DTransaction dtrans4 = new DTransaction("miracle", "789", cal, "PES2017", 20.52);
        
        repository.save(dtrans1);
        repository.save(dtrans2);
        repository.save(dtrans3);
        repository.save(dtrans4);
	}
	
	@Test
	public void testFindByWorkereId(){
		 List<DTransaction> dTransactions = repository.findByWorkerId("dchen");
		 
		 dTransactions.forEach((DTransaction trans) -> {
         	System.out.println(trans.getId());
         	System.out.println(trans.getWorkerId());
         	System.out.println(trans.getGameName());
         	System.out.println(trans.getTransactionDate());
         });
	}
	
	@Test
	public void testFindByTransactionDate(){
		List<DTransaction> dTransactions = repository.findByTransactionDate(cal);
		 
		dTransactions.forEach((DTransaction trans) -> {
        	System.out.println(trans.getId());
        	System.out.println(trans.getWorkerId());
        	System.out.println(trans.getGameName());
        	System.out.println(trans.getTransactionDate());
        });
	}

}
