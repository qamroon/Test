/**
 * 
 */
package com.mycomp;

import java.io.Serializable;

/** 
 * @author nalam
 *
 */
public class Emp implements Serializable {
private int empNumber;
private String empName;
private String job;
private double sal;
public Emp(){

}
public Emp(String empName, String job, double sal, String empAddr) {
	super();
	this.empName = empName;
	this.job = job;
	this.sal = sal;
	this.empAddr = empAddr;
}
private String empAddr;


public int getEmpNumber() {
	return empNumber;
}
public void setEmpNumber(int empNumber) {
	this.empNumber = empNumber;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public String getEmpAddr() {
	return empAddr;
}
public void setEmpAddr(String empAddr) {
	this.empAddr = empAddr;
}

}
