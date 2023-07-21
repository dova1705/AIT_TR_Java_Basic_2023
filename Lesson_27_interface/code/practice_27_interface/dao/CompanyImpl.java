package practice_27_interface.dao;


import practice_27_interface.model.Employee;

public class CompanyImpl implements Company{

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee fineEmployee(int id) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void printEmployee() {

    }
}
