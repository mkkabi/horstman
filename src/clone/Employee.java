/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clone;

 2
 3  import java.util.Date;
 4  import java.util.GregorianCalendar;
 5  public class Employee implements Cloneable
 6  {
 7     private String name;
 8     private double salary;
 9     private Date hireDay;
10
11     public Employee(String n, double s)
12     {
13        name = n;
14        salary = s;
15        hireDay = new Date();
16     }
17
18     public Employee clone() throws CloneNotSupportedException
19     {
20        // call Object.clone()
21        Employee cloned = (Employee) super.clone();
22
23        // clone mutable fields
24        cloned.hireDay = (Date) hireDay.clone();
25
26        return cloned;
27     }
28
29     /**
30      * Set the hire day to a given date.
31      * @param year the year of the hire day
32      * @param month the month of the hire day
33      * @param day the day of the hire day
34      */
35     public void setHireDay(int year, int month, int day)
36     {
37        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
38
39        // Example of instance field mutation
40        hireDay.setTime(newHireDay.getTime());
41     }
42
43     public void raiseSalary(double byPercent)
44     {
45        double raise = salary * byPercent / 100;
46        salary += raise;
47     }
48
49     public String toString()
50     {
51        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
52     }
53  }