package company_employee.dao;

import company_employee.model.Employee;

public class CompanyImpl implements Company {

    //поля о компании
   private Employee[] employees;
   private int size;//размер компании

    //конструктор
   public CompanyImpl(int capacity) {
       employees = new Employee[capacity];//capacity становится длина массива
   }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length){
            return false;
        }
        employees[size] = employee;//добавление в конец массива
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {//Метод будет возвращать объект employee типа Employee
       //алгоритм удаления сотрудника из массива по его id
        // ищем в цикле по всем employee (перебираем в цикле, обегаем массив)
        //если нашелся сотрудник с заданным id,
        // 1. сохранить удаляемого сотрудника victim в объектную переменную
        // 2. на место удаленного переносим последнего в массиве
        // 3. последнего затираем с помощью null
        // 4. size--; уменьшаем размер массива.
        for (int i = 0; i < employees.length; i++) { //перебираем в цикле, обегаем массив
            if (employees[i].getId() == id){ //если нашелся сотрудник с заданным id,
                Employee victim = employees[i];//сохранить удаляемого сотрудника victim в объектную переменную
                employees[i] = employees[size - 1];//на место удаленного переносим последнего в массиве
                employees[size - 1] = null;//последнего затираем с помощью null
                size--; //уменьшаем размер массива.
                return victim;//если нашли в цикле выходим из массива
            }
        }
       return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size(); i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployee() {

    }
}
