package com.hr.personnel;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception {
    employee = new Employee("Deepak",
        LocalDate.of(2022, 07, 05));
  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate() {

    /* arrange
    setting up new Employee object accomplished in setUp method above
     */


    // act
    String employeeInfo = employee.getEmployeeInfo();

    // assert
    Assert.assertEquals("name = Deepak, hireDate = 2022-07-05", employeeInfo);
  }

  @Test
  public void work() {

    String workInfo = employee.work();
    Assertions.assertThat(workInfo).isEqualTo("Deepak worked!");
  }
}