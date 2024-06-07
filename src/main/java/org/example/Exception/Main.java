package org.example.Exception;
import org.example.Exception.Ex1.*;
import org.example.Exception.Ex2.*;
;


public class Main {
    public static void main(String[] args)
    {
            ex_1();
    }
    public static void ex_1()
    {
        Employee newDev = new Dev(5,"Nam","Nam", "Java","Javascript");
        Employee newTester = new Tester(4,"Duong", "Nu", "Testing", "high level");
        Employee newManager = new Manager(10,"Hanh", "Nam","IT", "high level");

         Employee[] employees = {newDev, newManager, newTester};
         for(Employee employee : employees)
         {

            employee.joinDailyMeeting();        
            employee.takeARest();
            employee.goHome();
         }
    }
  
}
