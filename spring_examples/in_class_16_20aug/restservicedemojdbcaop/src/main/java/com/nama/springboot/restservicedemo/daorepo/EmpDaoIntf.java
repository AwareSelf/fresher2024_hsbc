package com.nama.springboot.restservicedemo.daorepo;

import com.nama.springboot.restservicedemo.exception.EmployeeAlreadyExists;
import com.nama.springboot.restservicedemo.exception.EmployeeNotFound;
import com.nama.springboot.restservicedemo.model.Emp;

import java.util.List;
import java.util.Optional;

public interface EmpDaoIntf {

    int count();

    int save(Emp e) throws EmployeeAlreadyExists;

    int update(Emp e);

    int deleteById(int id) throws EmployeeNotFound;

    List<Emp> findAll();

    Optional<Emp> findById(int id);
}
