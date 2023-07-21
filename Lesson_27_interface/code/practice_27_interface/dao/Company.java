package practice_27_interface.dao;

import practice_27_interface.model.Worker;

public interface Company {
    //перечень действий = метод

    //брать на работу
    boolean addEmployee(Worker.Employee employee);//добавить сотрудника в компанию

    //увольнение
    Worker.Employee removeEmployee(int id);//удаляет сотрудника из компании (тип Employee)

    //найти сотрудника по id (поиск)
    Worker.Employee fineEmployee(int id);//ищет сотрудника в компании (тип Employee)

    //размер компании
    int size ();

    //печатаем список компании
    void printEmployee();


}
