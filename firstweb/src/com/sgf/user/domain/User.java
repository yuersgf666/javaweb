package com.sgf.user.domain;

import java.math.BigDecimal;

/**
 * 　实体类
 * @author cxf
 *
 */
public class User {
	private Integer account;
	private String username;
	private String password;
	private String verifyCode;

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", verifyCode=" + verifyCode + "]";
	}
}
