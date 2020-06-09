package com.company.model;

import java.io.Serializable;

public class EmployeeEvaluation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String employee;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Employee v1 {" + employee + "}";
    }
}
