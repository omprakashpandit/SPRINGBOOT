package com.kkhindigyan.app.model;

public class MySQLDatabase {

	private String jdbcUrl;
	private String username;
	private String password;
	private String driver_class_name;
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
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
	public String getDriver_class_name() {
		return driver_class_name;
	}
	public void setDriver_class_name(String driver_class_name) {
		this.driver_class_name = driver_class_name;
	}
	@Override
	public String toString() {
		return "MySQLDatabase [jdbcUrl=" + jdbcUrl + ", username=" + username + ", password=" + password
				+ ", driver_class_name=" + driver_class_name + "]";
	}
	
	
	
	
}
