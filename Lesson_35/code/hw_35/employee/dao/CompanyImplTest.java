package hw_35.employee.dao;

import hw_35.employee.model.Employee;
import hw_35.employee.model.Engineer;
import hw_35.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    //поля класса
    CompanyImpl company; //поле, подключение тестируемого класса, создание объектной переменной
    Employee[] employees; //поле типа Employee, это массив, пока он получил только название

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(10);//вызов конструктора
        employees = new Employee[5];
        employees[0] = new Worker("Jack", 1990, 5,100,3,160);
        employees[1] = new Engineer("Mike",1994,3,101,5,160);
        employees[2] = new Engineer("Sara", 1993, 3,102,4,160);
        employees[3] = new Worker("Anna", 1995, 2,103,3,160);
        employees[4] = new Worker("Tom", 1991, 6,104,3,160);

        for (int i = 0; i < employees.length; i++) {//цикл
            company.addEmployee(employees[i]);//добавляет работников
        }
    }

    @Test
    void addEmployee() {
        System.out.println("количество сотрудников: " + company.size()); //печать количество работников
        //для того что-бы добавить нужно создать
        Engineer engineer = new Engineer("David",1996,4,105,4,160);
        assertTrue(company.addEmployee(engineer));//проверяем добавился ли новый работник
        assertFalse(company.addEmployee(null)); //тест на добавление null (нельзя добавить null)
        assertFalse(company.addEmployee(engineer));//тест на добавление работника
        assertEquals(6, company.size());//проверка size (количество работников)
        company.printEmployee(employees);//печать сотрудников ??? добавленного не печатает

    }

    @Test
    void removeEmployee() {
        System.out.println("количество сотрудников до удаления: " + company.size()); //печать количество работников
        company.printEmployee(employees);//печать списка работников
        assertEquals(employees[4], company.removeEmployee(104));//тест на удаление работника (assertEquals сравнение объекта с объектом)
        assertEquals(4, company.size());//проверка size (количество работников)
        System.out.println("количество сотрудников после удаления: " + company.size()); //печать количество работников
        assertEquals(employees[1], company.removeEmployee(101));//тест на удаление работника (assertEquals сравнение объекта с объектом)
        System.out.println("количество сотрудников после удаления: " + company.size()); //печать количество работников
        company.printEmployee(employees);//печать списка работников

    }

    @Test
    void findEmployeeByName() {
        System.out.println("количество сотрудников : " + company.size()); //печать количество работников
        company.printEmployee(employees);//печать списка работников
        assertEquals(employees[2], company.findEmployeeByName(102));//тест для поиска объекта
        System.out.println(company.findEmployeeByName(102));//печать искомого объекта
    }

    @Test
    void sortByExperienceTest(){
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getExperience(), o2.getExperience());//сравнение по полю experience
            }
        };

        company.printEmployee(employees);//печать списка работников до сортировки
        Arrays.sort(employees, employeeComparator);//сортировка на вход подаем массив и comparator
        company.printEmployee(employees);//печать списка работников после сортировки
    }

    @Test
    void sortByNameTest(){
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());//сравнение по полю name
            }
        };
        company.printEmployee(employees);//печать списка работников до сортировки
        Arrays.sort(employees, employeeComparator);//сортировка на вход подаем массив и comparator
        company.printEmployee(employees);//печать списка работников после сортировки
    }

    @Test
    void sortByYearOfBirthTest() {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return -(o1.getYearOfBirth() - o2.getYearOfBirth());//сортировка по год рождению
            }
        };
        company.printEmployee(employees);//печать списка работников до сортировки
        Arrays.sort(employees, employeeComparator);//сортировка на вход подаем массив и comparator
        company.printEmployee(employees);//печать списка работников после сортировки
    }

}