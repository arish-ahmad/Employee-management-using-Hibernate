package in.arish;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer empId;
	
	@Column(name="name")
	String empName;
	
	@Column(name="email")
	String email;
	
	@Column(name="address")
	String empAdd;
	
	@Column(name="mobileno")
	String empMob;
	
	
	
	public Employee() {
		super();
	}
	public Employee(String empName,String email, String empAdd, String  empMob) {
		super();
		this.empName = empName;
		this.empAdd = empAdd;
		this.empMob = empMob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public String getEmpMob() {
		return empMob;
	}
	public void setEmpMob(String empMob) {
		this.empMob = empMob;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + ", empMob=" + empMob
				+ ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpAdd()=" + getEmpAdd()
				+ ", getEmpMob()=" + getEmpMob() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
