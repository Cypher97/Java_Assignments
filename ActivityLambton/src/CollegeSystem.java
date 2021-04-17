import customException.InValidNameException;
import customException.InValidSalaryException;
import employee.Employee;
import employee.FullTime;
import employee.PartTime;

import student.Student;
import vehicle.Car;
import vehicle.Color;


import java.util.ArrayList;


public class CollegeSystem {
    public static void main(String[] args) {

        ArrayList<Person> person  = new ArrayList<Person>();
        try{
            FullTime fullTimeEmloyee = new FullTime(1 , "Richahfjkshfkdahfkd", "Gohel", Gender.FEMALE , null , 1000, "HR" , 20);
            person.add(fullTimeEmloyee);
        }catch (InValidSalaryException e){
            System.out.println(e);
        }catch (InValidNameException en){
            System.out.println(en);
        }


        try{
            Car c1 = new Car(123 , "TOYOTA" , true , Color.BLACK);
            PartTime partTimeEmployee = new PartTime( 2 , "Suman" , "Sharma" , Gender.MALE , c1 , 500 , "Account" ,20 , 15);
            person.add(partTimeEmployee);
        }catch (InValidSalaryException e){
            System.out.println(e);

        }catch (InValidNameException en){
            System.out.println(en);
        }

        try {
            com.lambton.student.FullTime fullTimeStudent = new com.lambton.student.FullTime(1, "Richa Gohel Richa Gohel Richa Gohel ", "Gohel1", Gender.FEMALE, null, "Lambton College", "CSAT", "A", 20);
            person.add(fullTimeStudent);
        }catch (InValidNameException e){
            System.out.println(e);
        }

        try{
            Car c2 = new Car(124 , "SUZUKI" , true , Color.BLUE);
            com.lambton.student.PartTime partTimeStudent = new com.lambton.student.PartTime(1 , "Richa2", "Gohel2", Gender.FEMALE , c2, "Lambton College" ,"CPCT" , "B" ,5);
            person.add(partTimeStudent);
        }catch (InValidNameException e){
            System.out.println(e);
        }



        for (Person p : person)
        {
            if(p instanceof Employee){
                System.out.println("=================Employee================");
                if (p instanceof FullTime) {
                    System.out.println("*************Full Time Employee***************");
                }
                if (p instanceof PartTime) {
                    System.out.println("*************Part Time Employee***************");
                }
            }

            if(p instanceof Student) {
                System.out.println("=================Student================");
                if (p instanceof com.lambton.student.FullTime) {
                    System.out.println("*************Full Time Student***************");
                }
                if (p instanceof com.lambton.student.PartTime) {
                    System.out.println("*************Part Time Student***************");
                }
            }
            p.display();
        }

    }
}
