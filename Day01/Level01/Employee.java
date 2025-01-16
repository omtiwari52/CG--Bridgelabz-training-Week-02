package Day01.Level01;
import java.util.Scanner;
public class Employee {
    
    //Declaring attributes
    String name;
    String id;
    int salary;


    Employee(String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        
        Employee display = new Employee("Om","01119993" , 20000);
        display.printDetails();

    }
}
