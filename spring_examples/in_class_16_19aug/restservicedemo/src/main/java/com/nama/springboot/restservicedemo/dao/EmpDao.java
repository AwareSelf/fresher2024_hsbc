package com.nama.springboot.restservicedemo.dao;

import com.nama.springboot.restservicedemo.model.Emp;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class EmpDao implements EmpDaoIntf {

    private List<Emp> arr;

    public EmpDao()
    {
        this.arr = new ArrayList();
        Emp e1 = new Emp(1,"Ram",5000);
        Emp e2 = new Emp(2,"Shyam",6000);
        this.arr.add(e1);
        this.arr.add(e2);
    }


    @Override
    public Optional<Emp> getEmp(int empId) {
        Optional<Emp> e1 = this.arr.stream()
                                   .filter(e->e.getEmpId()==empId)
                                   .findFirst();
         return e1;
      }

    @Override
    public List<Emp> getAllEmps() {
        return this.arr;
    }

    @Override
    public Emp saveEmp(Emp e) {
        this.arr.add(e);
        return e;
    }

    @Override
    public boolean removeEmp(Emp e) {
        List<Emp> lst = this.arr.stream()
                .filter(ele->ele.getEmpId()==e.getEmpId())
                .collect(Collectors.toList());
        lst.forEach(emp->this.arr.remove(emp));
        if(lst.size()>0) //means there was matching emp in the lst which got removed
            return true;
        else
            return false;

    }

    @Override
    public boolean updateEmp(Emp e) {
        //first remove the matching emp and then add the current one -
        //this is equivalent to update, as direct update in collection not possible
        List<Emp> lst = this.arr.stream()
                .filter(ele->ele.getEmpId()==e.getEmpId())
                .collect(Collectors.toList());
        lst.forEach(emp->this.arr.remove(emp));
        lst.add(e);
        if(lst.size()>0) //it means matching emp was found in the list to be updated
          return true;
        else
            return false;
    }
}
