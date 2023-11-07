package practice_56;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ArrayList<Integer> listOfLoop = new ArrayList<>();
        List<Integer> listOfStream = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            //ожидаем увидеть тут логику
            int y = list.get(i) * list.get(i);
            listOfLoop.add(y); // []
        }

        //конвейерные операции не будут выполнены если нет терминальной
        listOfStream = list.stream()
                .map(y -> y * y)
                .collect(Collectors.toList());

        System.out.println("listOfLoop: " + listOfLoop);
        System.out.println("listOfStream: " + listOfStream);
        System.out.println("listOfStream: class name: " + listOfStream.getClass().getSimpleName());
    }
}
