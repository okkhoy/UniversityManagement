package com.um.staff;

public class AdminStaff extends Staff{

    private int baseSalary;
    private int multiplier;

    @Override
    public int calculateSalary() {
        int salary = baseSalary + multiplier * getHoursClocked();
        return 0;
    }
}
