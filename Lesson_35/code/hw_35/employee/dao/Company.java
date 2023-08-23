package hw_35.employee.dao;

import cars.model.Car;
import hw_35.employee.model.Employee;

public interface Company {

    //добавление работника
    boolean addEmployee(Employee employee);

    //удаление работника
    Employee removeEmployee (String name);

    //найти работника в списке сотрудников
    Employee findEmployeeByName (String name);
    //todo

}
