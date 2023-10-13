package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Employees")
public class  ListEmployee{

@Id
@GeneratedValue
@Column(name="ID")
private int id;
@Column(name="NAME")
private String name;
//@Column(name="DEPARTMENT")
//private
//String department;
@Column(name="HOURS")
private
int hours2;
@Column(name="PAYPERHOUR")
private
double payperhour2;
@ManyToOne(cascade = CascadeType.MERGE)
@JoinColumn(name= "DEPARTMENTID", nullable=false)
private Department department = new Department();

public ListEmployee(){
	super();
}

public ListEmployee
( String name, Department department, int hours2, double payperhour2){
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

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}





}
