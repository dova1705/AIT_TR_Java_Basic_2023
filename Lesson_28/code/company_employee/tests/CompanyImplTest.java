package company_employee.tests;

import company_employee.dao.Company;
import company_employee.dao.CompanyImpl;
import company_employee.model.Employee;
import company_employee.model.Manager;
import company_employee.model.SalesManager;
import company_employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyImplTest {
    Company company;//создали объект класса Company
    Employee[] firm;
    @BeforeEach
    void setUp(){
        company = new CompanyImpl(5);
        firm = new Employee[4];
        //создаем работников
        firm[0] = new Manager(100, "Jack", "Sparrow", 174, 5000, 5);
        firm[1] = new SalesManager(101, "Julia", "Roberts", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Roma", "Robert", 175, 300000, 0.1);
        firm[3] = new Worker(103, "Robert", "Downey jr", 80, 20);

        //добавляем работников в company
        for (int i = 0; i < firm.length; i++) {
            company.addEmployee(firm[i]);
        }
}
    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null)); //нельзя добавить пустого сотрудника
        assertFalse(company.addEmployee(firm[0])); // нельзя добавить существующего сотрудника
        assertFalse(company.addEmployee(firm[1])); // нельзя добавить существующего сотрудника
        assertFalse(company.addEmployee(firm[2])); // нельзя добавить существующего сотрудника
        assertFalse(company.addEmployee(firm[3])); // нельзя добавить существующего сотрудника
        assertEquals(4, company.size()); //тест проверка size
        Employee employee = new SalesManager(106, "Peter", "Petrov", 180, 40000, 0.1); //добавление нового сотрудника
        assertTrue(company.addEmployee(employee));//тест на добавление
        assertEquals(5, company.size()); //тест проверка size
        assertFalse(company.addEmployee(firm[3]));// нельзя добавить уже имеющегося сотрудника
        employee = new SalesManager(106, "Vasia", "Ivanov", 180, 40000, 0.1);
        assertFalse(company.addEmployee(employee)); //нельзя выйти за размер компании
    }

    @Test
    void removeEmployee() {
        System.out.println(company.size());
        assertEquals(firm[2], company.removeEmployee(102));
        System.out.println(company.size());
    }

    @Test
    void findEmployee() {
        System.out.println(company.size());
        assertEquals(firm[1], company.findEmployee(101));
        //System.out.println(company.size());
    }

    @Test
    void size() {
    }

    @Test
    void printEmployee() {

    }
}
