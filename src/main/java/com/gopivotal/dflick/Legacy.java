package com.gopivotal.dflick;

public class Legacy {

	private String hostname;
	private String port;
	private String username;
	private String password;
	
	public Legacy()
	{
	}

	@Override
	public String toString() {
		return "[hostname=" + hostname + ", port=" + port
				+ ", username=" + username + ", password=" + password + "]";
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
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
}
