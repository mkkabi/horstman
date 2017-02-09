/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clone;


 3  /**
 4   * This program demonstrates cloning.
 5   * @version 1.10 2002-07-01
 6   * @author Cay Horstmann
 7   */
 8  public class CloneTest
 9  {
10     public static void main(String[] args)
11     {
12        try
13        {
14           Employee original = new Employee("John Q. Public", 50000);
15           original.setHireDay(2000, 1, 1);
16           Employee copy = original.clone();
17           copy.raiseSalary(10);
18           copy.setHireDay(2002, 12, 31);
19           System.out.println("original=" + original);
20           System.out.println("copy=" + copy);
21        }
22        catch (CloneNotSupportedException e)
23        {
24           e.printStackTrace();
25        }
26     }
27  }