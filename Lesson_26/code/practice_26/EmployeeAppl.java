package practice_26;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee[] firma = new Employee[6];//массив состоящих из объектов, каждый объект - это сотрудник
        firma[0] = new Manager(100, "Jack", "Sparrow", 174, 5000, 5);
        firma[1] = new SalesManager(101, "Brad", "Pitt", 174, 300000, 0.1);
        firma[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firma[3] = new Worker(103, "Robert", "Downey jr", 80, 20);

        printArray(firma);

        double totalSalary =totalSalary(firma);
        System.out.println("Total month salary = " + totalSalary);

    }//end of method main

    //------------method------------
    public static double totalSalary(Employee[] firma){
        double sum = 0;
        for (int i = 0; i < firma.length; i++) {
            if (firma[i] != null){
                sum += firma[i].calcSalary();
            }
        }
        return sum;
    }

    public static void printArray(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= null) {
                System.out.println(arr[i]);
            }
        }
    }

}
