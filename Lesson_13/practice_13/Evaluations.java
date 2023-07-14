public class Evaluations {
    public static void main(String[] args) {
        //Имеются оценки абитуриента из его аттестата, всего 12 оценок. Найдите средний балл абитуриента.

        System.out.println("Вычисление среднего бала абитуриента");
        int [] array = {5, 3, 3, 4, 5, 3, 4, 5, 4, 5, 3, 3};
        int sum = 0; //создаем переменную для накопления суммы
        //для нахождения среднего балла первым шагом суммируем всех оценок
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];//здесь суммируем оценки
        }
        //для нахождения среднего балла делим сумму на их кол-во
        double result = (double) sum / array.length;//здесь находим средний балл

        System.out.println("средний балл абитуриента: " + result); //печатаем результат
        System.out.printf("средний балл абитуриента: %.03 f", result);
        System.out.println();
        System.out.printf("средний балл абитуриента: %.02f", result);
        System.out.println();
        System.out.printf("средний балл абитуриента: %.01f", result);


    }
}