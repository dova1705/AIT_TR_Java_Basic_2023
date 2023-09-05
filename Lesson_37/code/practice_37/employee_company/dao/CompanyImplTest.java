package practice_37.employee_company.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_37.employee_company.model.Employee;
import practice_37.employee_company.model.Engineer;
import practice_37.employee_company.model.Worker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    //поля класса
    CompanyImpl company; // что это? Поле, подключение тестируемого класса, создание объектной переменной
    Employee[] employees; // что это? Для чего? Поле типа Employee, это массив, пока он получил только название

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(10); //это вызов конструктора
        employees = new Employee[5];
        employees[0] = new Engineer(101, "John", 35, 7, "1 - phd",1000.0, 5,160);
        employees[1] = new Engineer(102, "Ann", 30, 5, "2 - university", 900.0, 4, 160);
        employees[2] = new Worker(103, "Peter", 45, 15, "3 - high school", 850.0, 160);
        employees[3] = new Worker(104, "Robin", 28, 10, "4 - real school", 750.0, 160);
        employees[4] = new Worker(105, "Mike", 20, 2, "4 - real school", 600.0, 160);
        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }
    }

    @Test
    void addEmployee() {
        System.out.println(company.size()); //печать размера

        Engineer engineer = new Engineer(106L, "Stefan", 40, 1, "3 - high school", 900, 4, 160); //создали новый объект типа Engineer
        assertTrue(company.addEmployee(engineer)); //тест на добавление
        System.out.println(company.size()); //печать размера
        assertEquals(6, company.size()); //проверка size
        assertFalse(company.addEmployee(null)); //тест на добавление null
        assertFalse(company.addEmployee(engineer)); //тест на добавление дубликата
    }

    @Test
    void removeEmployee() {
        System.out.println(company.size()); //печать размера (size)
        company.printEmployees();//печать массива
        //Employee victim = company.removeEmployee(105);
        //assertEquals(employees[4], victim);
        assertEquals(employees[4], company.removeEmployee(105));//тест на удаление, выбрали произвольного сотрудника
        System.out.println(company.size()); //печать размера size
        company.printEmployees();//печать массива
        assertEquals(4, company.size()); //проверили что размер компании size уменьшился
        assertEquals(employees[1], company.removeEmployee(102));//тест на удаление, выбрали произвольного сотрудника
        System.out.println(company.size()); //печать размера size
        company.printEmployees();//печать массива
    }

    @Test
    void findEmployee() {


    }

    @Test
    void size() {


    }

    @Test
    void printEmployees() {


    }
    @Test
    void sortByExperience(){

        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getExperience() - o2.getExperience();//сравнение по полю experience которое имеет тип int
                //return Integer.compare(o1.getExperience(), o2.getExperience());//сравнение по полю experience которое имеет тип int
            }
        };

        company.printEmployees();
        Arrays.sort(employees, employeeComparator);
        company.printEmployees();
    }

}

//        **Задание 6.**
//        Создать компараторы и получить отсортированные списки сотрудников:
//        - по возрасту
//        - по стажу работы в компании
//        - по величине зарплаты
//        - по образованию (выше образованные в начале списка)