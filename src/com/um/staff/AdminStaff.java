package com.um.staff;

public class TeachingStaff extends Staff{

    private int baseSalary;

    @Override
    public int calculateSalary() {
        salary = baseSalary + getHoursClocked();
        return 0;
    }
}
