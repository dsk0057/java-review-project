package com.hr.personnel.client;

import com.hr.personnel.Employee;
import java.time.LocalDate;

public class HRClient {

  public static void main(String[] args) {

    Employee employee1 = new Employee();
    employee1.setName("Deepak");
    employee1.setHireDate(LocalDate.of(2022, 07, 05));
    String employeeInfo1 = employee1.getEmployeeInfo();
    System.out.println("Employee1 info = " + employeeInfo1);

    Employee employee2 = new Employee("Mary", LocalDate.of(2019, 04, 21));
    String employeeInfo2 = employee2.getEmployeeInfo();
    System.out.println("Employee2 info = " + employeeInfo2);
  }

}
