package test;

import inheritance.*;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        
        Person person1 = new Person ("Andy", 19,'F', "Neiva");
        System.out.println(person1.detail());
        print(person1);
        //Crear empleados 
        Employee employee1 = new Employee("Alex", 23, 3000);
        System.out.println(employee1.detail());
        print(employee1);
        
        var date = new Date();
        
        Client client1 = new Client (date, true, "Juan", 'M', 25, "Santo tomás");
        System.out.println(client1.detail());
        print(client1);
    }
    public static void print (Person people){
        System.out.println(people.detail());
    }
}