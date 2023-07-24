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

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CompanyImplTest {
    Company company;//создали объект класса Company
    Employee[] firm;
    @BeforeEach
    void setUp(){
        company = new CompanyImpl(5);
        firm = new Employee[4];
        firm[0] = new Manager(100, "Jack", "Sparrow", 174, 5000, 5);
        firm[1] = new SalesManager(101, "Julia", "Roberts", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Roma", "Robert", 175, 300000, 0.1);
        firm[3] = new Worker(103, "Robert", "Downey jr", 80, 20);

//        for (int i = 0; i < firm.length; i++) {
//            company.addEmployee(firm[i]);
//        }
}
    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null)); //нельзя добавить пустого сотрудника
        //нельзя добавить уже имеющегося сотрудника
        assertFalse(company.addEmployee(firm[1]));//пытаемся добавить существующего
        //должен расширить размер массива и добавить сотрудника
        //нельзя выйти за размер массива
      // firm[4] = new SalesManager(106, "Peter", "Petrov", 180, 40000, 0.1);
    }

    @Test
    void removeEmployee() {


    }

    @Test
    void fineEmployee() {
    }

    @Test
    void size() {
    }

    @Test
    void printEmployee() {

    }
}
