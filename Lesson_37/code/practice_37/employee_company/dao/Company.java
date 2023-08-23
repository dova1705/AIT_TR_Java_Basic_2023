package practice_37.employee_company.dao;

import practice_37.employee_company.model.Employee;

public interface Company {

    //в интерфейсе мы задаем сигнатуры методов, у методов отсутствуют тела
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    int size();

    void printEmployees();

}
