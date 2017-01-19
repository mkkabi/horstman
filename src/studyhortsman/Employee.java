/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studyhortsman;

/**
 *
 * @author matt
 */
public class Employee implements Comparable<Employee> {
int salary;
String name;

    public Employee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    
    public void raiseSalary (double byPercent){
        double raise =  salary *  byPercent / 100;
        salary += raise;
    }
    
    @Override
    public int compareTo(Employee other) {
        //Employee other = (Employee) o;
        if (salary < other.salary) return -1;
        if (salary > other.salary) return 1;
        return 0;
    }

}

