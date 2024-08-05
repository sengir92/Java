// create new Class
public class Employee {

    //define class attribute
    String name;
    double salary;
    int workHours;
    int hireYear;


    //create constructor method

    Employee(String name, double salary, int workHours, int hireYear) {
        //assign attribute to method variables
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //create tax method for tax calculation
    public double tax() {
        double tax = 0.0;
        if (salary > 1000.0) {
            tax = salary * 0.03;
        }
        return tax;
    }

    //create bonus method for bonus calculation
    public double bonus() {
        int bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    //create raiseSalary method for salary increase
    public double raiseSalary() {
        int workYear = 2021 - hireYear;

        if (workYear < 10) {
            return salary * 0.05;

        } else if (workYear >= 10 && workYear < 20) {
            return salary * 0.1;

        } else if (workYear > 19) {
            return salary * 0.15;

        }
        return 0;

    }

    //create toString method for show all information of employees
    @Override
    public String toString() {
        return ("Name: " + name + "\n") +
                ("Salary: " + salary + "\n") +
                ("Work Hour: " + workHours + "\n") +
                ("Hire Year: " + hireYear + "\n") +
                ("Tax: " + tax() + "\n") +
                ("Bonus: " + bonus() + "\n") +
                ("Salary Increase: " + raiseSalary() + "\n") +
                ("Salary with tax and bonuses: " + (salary - tax() + bonus()) + "\n") +
                ("Total salary: " + (salary - tax() + bonus() + raiseSalary()));

    }

}
