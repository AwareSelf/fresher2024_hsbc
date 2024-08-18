package com.nama.springboot.restservicedemo.daorepo;


import com.nama.springboot.restservicedemo.model.Emp;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmpRowMapper implements RowMapper<Emp> {

  private EmpRowMapper() {}


  @Override
  public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new Emp(rs.getInt(1),
                   rs.getString(2),
                   rs.getDouble(3));
  }
}
