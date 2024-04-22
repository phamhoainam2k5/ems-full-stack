package com.vangtutorial.emsbackend.services;

import com.vangtutorial.emsbackend.dto.EmployeeDto;

import java.util.List;

public interface IEmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);

}
