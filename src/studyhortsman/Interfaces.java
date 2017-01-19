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
    Employee emp1 = new Employee("emp 1", 20);
    Employee emp2 = new Employee("emp 2", 30);
    System.out.println(emp1.compareTo (emp2));
    }
}