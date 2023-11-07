package practice_55;

public class StudentCode {
    public static void main(String[] args) {
        TempFuncInterface tempFuncInterface = (int x) -> {
            if (x % 2 == 0){
                System.out.println("is it even number");
            }else {
                System.out.println("is it odd number");
            }
        }; // конец лямбды выражения

        tempFuncInterface.temp(17);
    } // end of method main
} // end of class
