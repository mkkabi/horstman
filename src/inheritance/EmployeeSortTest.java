/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

import java.util.*;

/**
 * This program demonstrates the use of the Comparable interface.
 * @version 1.30 2004-02-27
 * @author Cay Horstmann
 */
public class EmployeeSortTest
{
   public static void main(String[] args)
   {
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Harry Hacker", 35000, 1980, 11, 15);
      staff[1] = new Employee("Carl Cracker", 75000, 1980, 11, 15);
      staff[2] = new Employee("Tony Tester", 38000, 1980, 11, 15);

      Arrays.sort(staff);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name = " + e.getName() + ", salary=" + e.getSalary());
   }
}