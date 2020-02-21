package edu.csbsju.cs;
   // the classes in this file are part of this package

import java.util.*;
   // import statements come after the package statement

public class Employee
{
   public Employee(String n, double s, int year, int month, int day)
   {
      name = n;
      salary = s;
      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
         // GregorianCalendar uses 0 for January
      hireDay = calendar.getTime();
      
   }

   public String getInfo(name, salary, hireday)
   {
	   return myString = toString(n+" my salary is, " + s);
   }
   
   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public Date getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byDollarValue)
   {
      double raise = salary * byDollarValue;
      salary += raise;
   }

   private String name;
   private double salary;
   private Date hireDay;
}
