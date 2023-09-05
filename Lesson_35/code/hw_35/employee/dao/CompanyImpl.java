package hw_35.employee.dao;

import hw_35.employee.model.Employee;


public class CompanyImpl implements Company {

    // это поля класса
    // заводим массив под сотрудников
    private Employee[] employees; // массив объектов класса Employee

    // кол-во сотрудников
    private int size; // это поле отвечает за количество сотрудников

    // это конструктор
    // метод, который получив на вход capacity определяет размер массива employees
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];//capacity правый ограничитель, size больше capacity не может быть
    }

    // метод, который добавляет нового сотрудника в массив
    @Override
    public boolean addEmployee(Employee employee) {
        // если сотрудник не null ИЛИ size еще не равен длине массива ИЛИ такой сотрудник уже есть, ТО
        if (employee == null || size == employees.length || findEmployeeByName((int) employee.getId()) != null) {
            return false; // Возвращаем false, т.к. сотрудника нельзя добавить!
        }
        employees[size++] = employee; // добавляем сотрудника в массив и увеличиваем size на 1
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {// получили на вход id
        for (int i = 0; i < size; i++) {// перебираем весь массив
            if (employees[i].getId() == id) {// находим жертву по его id
                Employee victim = employees[i];// в объектную переменную victim кладем найденного
//                employees[i] = employees[size - 1]; // берем последнего в списке и ставим его на место найденного
//                employees[size - 1] = null; // последнего в списке делаем null
//                size--; //уменьшаем размер на 1

                employees[i] = employees[--size];// берем последнего в списке и ставим его на место найденного (-- префиксная запись сначала размер минус)
                employees[size] = null;

                return victim;//возвращаем удаленный объект
            }
        }
        return null;//если не нашлось объект с заданным id возвращаем null
    }

    @Override
    public Employee findEmployeeByName(int id) {// получили на вход id
        for (int i = 0; i < size; i++) {// перебираем весь массив
            if (employees[i].getId() == id) {// находим жертву по его id
                return employees[i];//возвращаем найденного
            }
        }
        return null;//если не нашлось объект с заданным id возвращаем null
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployee(Object[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("==============================================================");
    }


}
