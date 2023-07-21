package practice_27_interface.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_27_interface.dao.Company;
import practice_27_interface.dao.CompanyImpl;
import practice_27_interface.model.Employee;
import practice_27_interface.model.Manager;
import practice_27_interface.model.SalesManager;
import practice_27_interface.model.Worker;

public class CompanyImplTest {
    Company company;//создали объект класса Company
    Employee[] firm;
    @BeforeEach
    void setUp(){
        company = new CompanyImpl();
        firm = new Employee[4];
        firm[0] = new Manager(100, "Jack", "Sparrow", 174, 5000, 5);
        firm[1] = new SalesManager(101, "Julia", "Roberts", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Roma", "Robert", 175, 300000, 0.1);
        firm[3] = new Worker(103, "Robert", "Downey jr", 80, 20);

        for (int i = 0; i < firm.length; i++) {
            company.addEmployee(firm[i]);
        }
}
    @Test
    void addEmployee() {
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
