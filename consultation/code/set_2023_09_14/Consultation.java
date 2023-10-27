package set_2023_09_14;

import java.util.HashSet;
import java.util.Set;

public class Consultation {
    // перебирать сет, но взять не все элементы (Раду)
    // задача взять 3 элемента из Set1 и 2 элемента из Set2 и положить их в Set3
    public static void main(String[] args) {
        // immutable set используется лишь потому, что его проще проинициализировать значениями сразу,
        // а не добавлять по одному
        Set<String> first = Set.of("one", "two", "three", "four", "five", "six");
        Set<String> second = Set.of("seven", "eight", "nine", "ten");

        // сет в который мы будем складывать элементы
        HashSet<String> setOfString = new HashSet<>();

        first.forEach(i -> System.out.print(i + " "));
        System.out.println("\n===========================");
        second.forEach(i -> System.out.print(i + " "));
        System.out.println("\n===========================");

        int counter = 0;
        for (String s : first) {
            // тк мы не можем брать элементы в сет по индексу, нам не подходит обычный цикл for
            // мы можем лишь итерироваться через весь сет. ТК задача стоит взять лишь рандомные три элемента
            // из first мы создали переменную counter, которую будем увеличивать при каждой итерации,
            // а как только counter будет равен 3, мы воспользуемся ключевым словом break, чтобы прервать итерацию,
            // тк это будет означать, что мы уже взяли 3 рандомные элемента из сета first.
            if (counter == 3) {
                break;
            }
            setOfString.add(s);
            counter++;
        }
        setOfString.forEach(i -> System.out.print(i + " "));
        System.out.println("\n===========================");

        for (String s : second) {
            if (s.length() > 4){
                setOfString.add(s);
            }
        }
        setOfString.forEach(i -> System.out.print(i + " "));
        System.out.println("\n===========================");
    }
}
