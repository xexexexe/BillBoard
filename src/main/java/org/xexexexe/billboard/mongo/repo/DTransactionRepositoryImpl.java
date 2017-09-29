package org.xexexexe.billboard.mongo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.xexexexe.billboard.mongo.domain.DTransaction;

public class DTransactionRepositoryImpl implements DTransactionRepositoryCustom{
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<DTransaction> queryByGame(String gameName) {
		Query query = new Query(Criteria.where("gameName").is(gameName));
		return mongoTemplate.find(query, DTransaction.class);
	}

}
