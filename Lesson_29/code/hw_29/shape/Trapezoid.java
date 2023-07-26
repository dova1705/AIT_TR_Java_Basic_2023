package hw_29.shape;

public class Trapezoid extends Shape{
    //поля
    private int height;
    private int secondSide;

    public Trapezoid(double side, int height, int secondSide) {
        super(side);
        this.height = height;
        this.secondSide = secondSide;
    }

    @Override
    public double calcArea(double side) {
        return 0;
    }

   // @Override
    //public double calcArea(double side, int height, int secondSide) {
  //      return 1/2 * (side + secondSide) * height; //S= 1/2× (a+b)×h
  //  }

    @Override
    public double calcPerimeter(double length) {
        return 0;
    }
}
