package homework.employee.controller;

import homework.employee.model.Employee;
public class FirmaAppl {
    public static void main(String[] args) {


        Employee person1 = new Employee("AO324465", "Dova", "Allakov", "м", 1400);
        Employee person2 = new Employee("I-MR332145","Irina", "Gerasimova","ж", 1600);
        Employee person3 = new Employee("AO78541", "Stanislav", "Korsak", "м", 1800);

        person1.display();
        System.out.println();
        person2.display();
        System.out.println();
        person3.display();
    }
}
