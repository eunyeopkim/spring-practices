package com.douzone.container.user;

public class Friend {
	private String name = "친구";

	public Friend(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}

}
