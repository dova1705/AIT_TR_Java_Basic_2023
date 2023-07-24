package company_employee.dao;


import company_employee.model.Employee;

public interface Company {
    //перечень действий = метод

    //брать на работу
    boolean addEmployee(Employee employee);//добавить сотрудника в компанию

    //увольнение
    Employee removeEmployee(int id);//удаляет сотрудника из компании (тип Employee)

    //найти сотрудника по id (поиск)
    Employee findEmployee(int id);//ищет сотрудника в компании (тип Employee)

    //размер компании
    int size ();

    //печатаем список компании
    void printEmployee();


}
