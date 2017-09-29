package org.xexexexe.billboard.mongo.repo;

import java.util.List;

import org.xexexexe.billboard.mongo.domain.DTransaction;



public interface DTransactionRepositoryCustom {
	List<DTransaction> queryByGame(String gameName);
}
