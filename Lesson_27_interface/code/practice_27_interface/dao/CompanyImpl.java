package practice_27_interface.dao;

import practice_27_interface.model.Worker;

public class CompanyImpl implements Company{

    @Override
    public boolean addEmployee(Worker.Employee employee) {
        return false;
    }

    @Override
    public Worker.Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Worker.Employee fineEmployee(int id) {
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
