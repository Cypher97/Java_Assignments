package employee;

import Gender;
import Person;
import customException.InValidNameException;
import customException.InValidSalaryException;
import vehicle.Vehicle;

import javax.xml.bind.ValidationException;

public abstract class  Employee extends Person   {

    double baseSalary;

    public Employee(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double baseSalary) throws InValidSalaryException, InValidNameException {
        super(id, firstname, lastname, gender, vehicle);
        if(InValidSalaryException.validateSalary(baseSalary)){
            this.baseSalary = baseSalary;
        }else{
            throw new InValidSalaryException("Invalid Salary: "+baseSalary);
        }

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) throws InValidSalaryException {

        if(InValidSalaryException.validateSalary(baseSalary)){
            this.baseSalary = baseSalary;
        }else{
            throw new InValidSalaryException("Invalid Salary: "+baseSalary);
        }
    }

    public abstract double calculateTotalSalary();



}
