package com.um.staff;

public abstract class Staff {
    private int hoursClocked;

    public int getHoursClocked() {
        return hoursClocked;
    }

    public void setHoursClocked(int hoursClocked) {
        this.hoursClocked = hoursClocked;
    }

    public abstract int calculateSalary();
}
