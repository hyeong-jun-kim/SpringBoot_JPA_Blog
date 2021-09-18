package com.android.start.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Student {
	private int stu_num;
	private String name;
	private String password;
	private String email;
	
	@Builder
	public Student(int stu_num, String name, String password, String email) {
		this.stu_num = stu_num;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public int getStu_num() {
		return stu_num;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
}
