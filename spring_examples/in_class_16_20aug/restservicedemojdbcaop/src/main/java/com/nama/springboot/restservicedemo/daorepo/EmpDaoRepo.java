package com.nama.springboot.restservicedemo.daorepo;

import com.nama.springboot.restservicedemo.model.Emp;
import com.nama.springboot.restservicedemo.restcontroller.EmpRestContoller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import com.nama.springboot.restservicedemo.exception.*;

import javax.sql.DataSource;
import java.util.*;

@Repository
public class EmpDaoRepo implements EmpDaoIntf {

    private JdbcClient jdbcClient;
    private RowMapper<Emp> rowMapper;

    public EmpDaoRepo(DataSource dataSource,RowMapper<Emp> rowMapper) {

        this.jdbcClient = JdbcClient.create(dataSource);
        this.rowMapper = rowMapper;
    }


    @Override
    public int count() {
        String sql = "select count(*) from emp";
       return jdbcClient.sql(sql).query(Integer.class).single();
    }

    public int count1(int empId) {
        String sql = "select count(*) from emp where empId=?";
        return jdbcClient.sql(sql).param(empId).query(Integer.class).single();
    }

    @Override
    public int save(Emp e) throws EmployeeAlreadyExists {

        int ct = count1(e.getEmpId());
        if(ct==0) {
            String str = "insert into emp values(?,?,?)";
            return this.jdbcClient
                    .sql(str)
                    .param(1, e.getEmpId())
                    .param(2, e.getEmpName())
                    .param(3, e.getEmpSal())
                    .update();
        }
        else
           throw new EmployeeAlreadyExists("emp with empId:"+e.getEmpId()+" already exists!");

    }

    @Override
    public int update(Emp e) {

        //similarly, add code for EmpNotFoundException as in deleted

        String str = "update emp set empname=?,empsal=?" +
                "where empid=?";
        return this.jdbcClient
                .sql(str)
                .param(1,e.getEmpName())
                .param(2,e.getEmpSal())
                .param(3,e.getEmpId())
                .update();

    }

    @Override
    public int deleteById(int id) throws EmployeeNotFound {
        int ct = count1(id);
        if(ct>=1) {
            String str = "delete from emp where empid=?";
            return this.jdbcClient
                    .sql(str)
                    .param(id)
                    .update();
        }
        else
        {
            throw new EmployeeNotFound("emp can't be deleted as emp with empId:"+id+" does not exist");
        }
    }

    @Override
    public List<Emp> findAll() {
        String str = "select * from emp";
        return this.jdbcClient
                   .sql(str)
                   .query(this.rowMapper)
                   .list();

    }

    @Override
    public Optional<Emp> findById(int id) {
        String sql ="select * from emp where empid=?";

        return this.jdbcClient
                   .sql(sql)
                   .param(id)
                   .query(this.rowMapper)
                   .optional();

    }
}
