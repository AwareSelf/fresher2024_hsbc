package vw.nama.web.MVCdemo.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {

	@Min(value = 1,message = "id should start with 1")
	int empId;
	
	@NotNull
	@NotBlank(message="emp name is mandatory")
	@Size(min = 3, message = "Name should have atleast 2 characters")
	String empName;
	
	@NotNull(message="emp joining date is mandatory")
	@Past(message="joining date has to be in the past")
	@DateTimeFormat(pattern="yyyy-mm-dd")
	LocalDate empJoiningDate;
	
    @NotNull(message="emp salary is mandatory")
	double empSalary;

	public Employee()
	{
		
	}
	
	public Employee(String empName, LocalDate empJoiningDate, double empSalary) {
		super();
	
		this.empName = empName;
		this.empJoiningDate = empJoiningDate;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public LocalDate getEmpJoiningDate() {
		return empJoiningDate;
	}

	public void setEmpJoiningDate(LocalDate empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	public double computeAnnSal()
	{
		return this.empSalary*12;
	}
	
	public double computeAnnSal(double bonus)
	{
		return this.empSalary*12+bonus;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empJoiningDate=" + empJoiningDate
				+ ", empSalary=" + empSalary + "]";
	}
	
	
}
