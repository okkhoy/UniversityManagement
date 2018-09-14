package com.um.staff;

public class SupportStaff extends Staff {

    private int baseSalary;
    private int overtimePay;

    @Override
    public int calculateSalary() {
        int salary = baseSalary + overtimePay + getHoursClocked();
        return 0;
    }
}
