package com.company;

public class Employee {
    String name;
    double salary, workHours;
    int hireYear;

    public static void main(String[] args) {
        Employee employee1 = new Employee("Arda",4100,47,1989);
        System.out.println(employee1.toString());
    }

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    static double tax(double salary) {
        double tax = 0;
        if (salary < 1000) {
            tax = 0.0;
        } else if (salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    static double bonus(double workHours) {
        double bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    static double raiseSalary(double salary, int hireYear) {
        int yearsWorked = 2021 - hireYear;

        if (yearsWorked > 19) {
            salary *= 1.05;
        } else if (yearsWorked > 9 && yearsWorked < 20) {
            salary *= 1.1;
        } else if (yearsWorked < 10) {
            salary *= 1.15;
        }
        return salary;
    }

    public String toString() {
        double total = salary + bonus(workHours) - tax(salary);
        return "Name : " + name + "\n" +
                "Salary : " + salary + "\n" +
                "Work Hours : " + workHours + "\n" +
                "Hire Year : " + hireYear + "\n" +
                "Tax : " + tax(salary) + "\n" +
                "Bonus : " + bonus(workHours) + "\n" +
                "Salary Raise : " + raiseSalary(salary, hireYear) + "\n" +
                "Salary with Bonus & Taxes : " + total ;

    }
}


