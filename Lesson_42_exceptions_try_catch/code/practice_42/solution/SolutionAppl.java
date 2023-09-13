package practice_42.solution;

import java.util.InputMismatchException;

public class SolutionAppl {
    public static void main(String[] args) {
        // a * x = b, x = b / a; a,b - int

        try {
            int a = 12;
            int b = 36;

            int x = solution(a, b);
            System.out.println("X = " + x);
        }
        catch (NoSolutionException e) {
//            System.out.println(e.getMessage());
//            System.out.println("а - не может равняться 0.");
            System.out.println("решения нет");
        }
        catch (AnyNumberSolution a){
            System.out.println("любое число - это решение");
        }
        finally {
            System.out.println("Удачи! Пока!");
        }
    }//end of main

    //-------------Methods-------------
    public static int solution(int a, int b) throws NoSolutionException{ //throws в Java используется для указания на возможность выброса исключения (exception) из метода.
        int res;
        if (a == 0 && b != 0){
            throw new NoSolutionException();
        }
        if (a == 0 && b == 0){
            throw new AnyNumberSolution();//можно использовать NoSolutionException()
        }
        res = b / a;
        return res;
    }
    //=================================

}//end of class
