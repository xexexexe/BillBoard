package org.xexexexe.billboard.mongo.domain;

import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class DTransaction {
	
	@Id
    private String id;
	
	private String workerId;
	private String adminId;
	private Calendar transactionDate;
	private String gameName;
	private double workingHour;
	private double price;
	
	public DTransaction(){}
	
	public DTransaction(String workerId, String adminId, Calendar date, String gameName, double workingHour){
		this.workerId = workerId;
		this.adminId = adminId;
		this.transactionDate = date;
		this.gameName = gameName;
		this.workingHour = workingHour;
		this.price = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public Calendar getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Calendar transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(double workingHour) {
		this.workingHour = workingHour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
