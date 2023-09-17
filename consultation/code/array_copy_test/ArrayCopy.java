package array_copy_test;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        //System.arrayCopy - протестировать
        //заполним массив целыми числами 10, 20, 30, ...
        int[] arrayInt = new int[10]; //объявили массив

        for (int i = 0; i < arrayInt.length; i++) {//запустили цикл для заполнения массива
            arrayInt[i] = (i + 1) * 10;
        }
        System.out.println(Arrays.toString(arrayInt));

        //хотим вставить в массив новый элемент, например 17 сохранив при этом порядок сортировки
        //применим BinarySearch для поиска места (индекс куда вставлять новый элемент массива)
        int index = Arrays.binarySearch(arrayInt, 17);//arrayInt - массив где будет происходить поиск, Arrays.binarySearch возвращает индекс (если индекс отрицательный меняем знак и минус 1)
        //обрабатываем индекс
        index = index >= 0 ? index : -index - 1;
        System.out.println(index);
        //увеличиваем массив и копируем исходный массив в новый
        int[] arrayIntCopy = new int[arrayInt.length +1];
        System.arraycopy(arrayInt,0,arrayIntCopy,0,arrayInt.length);
        //public static void arraycopy(Object sourceArray, int sourceStartIndex, Object destinationArray, int destinationStartIndex, int length)
        //System.arraycopy() - это метод в Java, который используется для копирования элементов одного массива в другой массив.
        //sourceArray - массив, из которого будут копироваться элементы.
        //sourceStartIndex - индекс элемента в sourceArray, с которого начнется копирование.
        //destinationArray - массив, в который будут скопированы элементы.
        //destinationStartIndex - индекс элемента в destinationArray, с которого начнется вставка скопированных элементов.
        //length - количество элементов для копирования.
        System.out.println(Arrays.toString(arrayIntCopy));

        // копируем "хвост" от элемента с этим индексом в право на один элемент
        System.arraycopy(arrayIntCopy, index,arrayIntCopy,index +1,arrayIntCopy.length - index -1);
        System.out.println(Arrays.toString(arrayIntCopy));
        //вставляем новый элемент на освобожденное место
        arrayIntCopy[index] = 17;
        //печатаем новый массив
        System.out.println(Arrays.toString(arrayIntCopy));
        System.out.println("=========================================================================");
        //хотим вставить в массив новый элемент, например 17 сохранив при этом порядок сортировки
        //применим BinarySearch для поиска места (индекс куда вставлять новый элемент массива)
        int index1 = Arrays.binarySearch(arrayInt, 31);//arrayInt - массив где будет происходить поиск, Arrays.binarySearch возвращает индекс (если индекс отрицательный меняем знак и минус 1)
        //обрабатываем индекс
        index1 = index1 >= 0 ? index1 : -index1 - 1;
        System.out.println(index1);
        //увеличиваем массив и копируем исходный массив в новый
        int[] arrayIntCopy1 = new int[arrayInt.length +1];
        System.arraycopy(arrayInt,0,arrayIntCopy1,0,arrayInt.length);
        //public static void arraycopy(Object sourceArray, int sourceStartIndex, Object destinationArray, int destinationStartIndex, int length)
        //System.arraycopy() - это метод в Java, который используется для копирования элементов одного массива в другой массив.
        //sourceArray - массив, из которого будут копироваться элементы.
        //sourceStartIndex - индекс элемента в sourceArray, с которого начнется копирование.
        //destinationArray - массив, в который будут скопированы элементы.
        //destinationStartIndex - индекс элемента в destinationArray, с которого начнется вставка скопированных элементов.
        //length - количество элементов для копирования.
        System.out.println(Arrays.toString(arrayIntCopy1));

        // копируем "хвост" от элемента с этим индексом в право на один элемент
        System.arraycopy(arrayIntCopy1, index1,arrayIntCopy1,index1 +1,arrayIntCopy.length - index1 -1);
        System.out.println(Arrays.toString(arrayIntCopy));
        //вставляем новый элемент на освобожденное место
        arrayIntCopy1[index1] = 31;
        //печатаем новый массив
        System.out.println(Arrays.toString(arrayIntCopy1));
    }
}
