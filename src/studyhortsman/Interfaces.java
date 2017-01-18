/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyhortsman;

/**
 *
 * @author qwe
 */
public class Interfaces {
    public static void main (String[] args)
    {
    Employee emp1 = new Employee(25, "emp 1");
    Employee emp2 = new Employee(30, "emp 2");
    System.out.println(emp1.compareTo (emp2));
    }
}
class Employee implements Comparable<Employee> {
int salary;
String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        //Employee other = (Employee) o;
        if (salary < other.salary) return -1;
        if (salary > other.salary) return 1;
        return 0;
    }

}
