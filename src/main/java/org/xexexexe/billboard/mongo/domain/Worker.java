package org.xexexexe.billboard.mongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Worker {
	
	@Id
	private String id;
	@Indexed(unique = true)
	private String name;
	private String phone;
	private String email;
	private String qrcode;
	
	public Worker(String name, String phone, String email, String qr){
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.qrcode = qr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

}
