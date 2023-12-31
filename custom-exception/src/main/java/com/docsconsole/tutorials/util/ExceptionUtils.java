package com.docsconsole.tutorials.util;

import com.docsconsole.tutorials.exception.DepartmentNotFoundException;
import com.docsconsole.tutorials.exception.EmployeeNotFoundException;
import com.docsconsole.tutorials.model.Department;
import com.docsconsole.tutorials.model.Employee;

public class ExceptionUtils {
    public Employee getEmployee(Integer id) throws EmployeeNotFoundException {
        if(id != null){
            return new Employee();
        }
        throw new EmployeeNotFoundException("Employee is not existed with given id.");

    }
    public Department getDepartment(Integer id) throws DepartmentNotFoundException {
        if(id != null){
            return new Department();
        }
        throw new DepartmentNotFoundException();

    }
}
