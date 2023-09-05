package hw_35.employee.dao;

import cars.model.Car;
import hw_35.employee.model.Employee;

public interface Company {

    //в интерфейсе мы задаем сигнатуры методов, у методов отсутствуют тела

    //добавление работника
    boolean addEmployee(Employee employee);//на вход получаем (тип имя)

    //удаление работника по id
    Employee removeEmployee (int id);//на вход получаем (тип имя)

    //найти работника в списке сотрудников по id
    Employee findEmployeeByName (int id);//на вход получаем (тип имя)

    //определить текущее количество сотрудников;
    int size();

    //напечатать список сотрудников.
    void printEmployee(Object[] arr);

}
