package com.nama.springboot.restservicedemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.util.Objects;

@Entity
public class Emp {


    @Id
    @Column(name="empid")
    @NotNull
    private int empId;

    @Column(name="empname",nullable = false)
    @NotNull
    @Size(min = 3, message = "emp Name should have atleast 2 characters")
    private String empName;

    @Column(name="empsal")
    @Min(value = 100,message = "emp salary should be atleast 100")
    private double empSal;

    public Emp() {
    }

    public Emp(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
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

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empId == emp.empId;
    }

    //it is not efficient change it later on hash on something else
    @Override
    public int hashCode() {
        return Objects.hashCode(empId);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
