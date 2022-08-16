package com.lzm.ssm.service;

import com.lzm.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author maomao
 * @create 2022-07-27 20:34
 */
public interface EmployeeService {
    List<Employee> getEmployeeList();

    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
