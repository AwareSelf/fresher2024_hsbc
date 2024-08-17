package com.nama.springboot.restservicedemo.dao;

import com.nama.springboot.restservicedemo.model.Emp;

import java.util.List;
import java.util.Optional;

public interface EmpDaoIntf {

    public Optional<Emp> getEmp(int empId);
    public List<Emp> getAllEmps();
    //add other emp-crud operations
    public Emp saveEmp(Emp e);
    public boolean removeEmp(Emp e);
    public boolean updateEmp(Emp e);
}
