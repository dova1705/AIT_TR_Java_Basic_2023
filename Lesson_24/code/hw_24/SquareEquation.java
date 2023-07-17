package hw_24;

public class SquareEquation {
    //поля класса

    Double a;
    Double b;
    Double c;


    //методы
    public Double equationQuadraticRoot1(Double a, Double b, Double c) {
        Double d = b * b - 4 * a * c;
        Double x1;
        x1 = null;
        if (d < 0) {
            System.out.println("Нет корней");
        }else {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: Х1 = " + x1);
        }
        return x1;
    }

    public Double equationQuadraticRoot2(Double a, Double b, Double c) {
        Double d = b * b - 4 * a * c;
        Double x2;
        x2 = null;
        if (d < 0) {
            System.out.println("Нет корней");
        }else {
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: Х2 = " + x2);

        }
        return x2;
    }




















    public Double equationQuadraticRootZero(Double a, Double b, Double c) {
        Double d = b * b - 4 * a * c;
        Double x0 = null;
        if (d == 0) {
            x0 = -b / (2 * a);
            System.out.println("Корни уравнения: 0 = " + x0);
        }
        return x0;
    }


}
