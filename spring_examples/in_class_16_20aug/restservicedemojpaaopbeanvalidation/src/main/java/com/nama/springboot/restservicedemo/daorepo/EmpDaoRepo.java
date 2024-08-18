package com.nama.springboot.restservicedemo.daorepo;

import com.nama.springboot.restservicedemo.model.Emp;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpDaoRepo extends JpaRepository<Emp,Integer> {

    @Transactional
    List<Emp> deleteByEmpName(String empName);


    //JPQL Query
    @Query("Select  e From Emp e where empName like '%m%'")
    List<Emp> empWithPatternInEmpName();

    //SQL Native Query
    @Query(value = "Select  *  From Emp e where empName like '%m%'", nativeQuery = true)
    List<Emp> empWithPatternInEmpNameUsingNativeQuery();




}
