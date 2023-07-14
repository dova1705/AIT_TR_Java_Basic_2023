public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("Array practice");

        int [] marks = { -7, 2, 5, -48, 5, -3, 5, 4, 1};
        int l = marks.length;
        System.out.println("Длина массива: " + l);//печатаем длину массива
        //System.out.println(marks);//так печатается ссылка в памяти на массив

        //так распечатывается весь массив
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " | ");
        }
        System.out.println();
        System.out.println("=======================================");
        System.out.println(marks[3]);
    }
}
