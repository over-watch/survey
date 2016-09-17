package com.watch.survey.entity;

import java.sql.Timestamp;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String login;
	private String password;
	private String pwConfirm;
	private String email;
	private Timestamp regDate;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String name, String login, String password, String pwConfirm,
			String email, Timestamp regDate) {
		this.name = name;
		this.login = login;
		this.password = password;
		this.pwConfirm = pwConfirm;
		this.email = email;
		this.regDate = regDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPwConfirm() {
		return this.pwConfirm;
	}

	public void setPwConfirm(String pwConfirm) {
		this.pwConfirm = pwConfirm;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

}