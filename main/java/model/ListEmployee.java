package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employees")
public class  ListEmployee{

@Id
@GeneratedValue
@Column(name="ID")
private int id;
@Column(name="NAME")
private
String name;
@Column(name="DEPARTMENT")
private
String department;
@Column(name="HOURS")
private
int hours2;
@Column(name="PAYPERHOUR")
private
double payperhour2;

public ListEmployee(){
	
}

public ListEmployee
( String name, String department, int hours2, double payperhour2){
this.name = name;
this.department = department;
this.hours2 = hours2;
this.payperhour2 = payperhour2;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getHours2() {
	return hours2;
}
public void setHours2(int hours2) {
	this.hours2= hours2;
}
public double getPayperhour2() {
	return payperhour2;
}
public void setPayperhour2(double payperhour2) {
	this.payperhour2 = payperhour2;
}

public String returnEmployeeDetails( ) {
return this.name + ": " +this.department;
}
public String returnEmployeePay( ) {
return "Pay this week:" + (this.hours2 * this.payperhour2);
}

}
