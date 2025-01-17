package com.example.demo;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpDBDao extends JpaRepository<Employee, Integer>{
  public List<Employee> findByDesignation(String designation);
  @Query("from Employee where designation=?1 order by ename desc")
  public List<Employee> getEmpsSortedByAge(String designation);

}
