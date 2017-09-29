package org.xexexexe.billboard.mongo.repo;

import java.util.Calendar;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.xexexexe.billboard.mongo.domain.DTransaction;

public interface DTransactionRepository extends MongoRepository<DTransaction, Long>, DTransactionRepositoryCustom {
	
	List<DTransaction> findByWorkerId(String workerId);
	
	List<DTransaction> findByTransactionDate(Calendar transactionDate);
	
}
