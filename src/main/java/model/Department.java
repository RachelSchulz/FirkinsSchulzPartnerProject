package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	private String departmentName;
	private String dptManagerName;
	@OneToMany(mappedBy="department", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ListEmployee> employees;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDptManagerName() {
		return dptManagerName;
	}
	public void setDptManagerName(String dptManagerName) {
		this.dptManagerName = dptManagerName;
	}
	public List<ListEmployee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<ListEmployee> employees) {
		this.employees = employees;
	}
	

	
}
