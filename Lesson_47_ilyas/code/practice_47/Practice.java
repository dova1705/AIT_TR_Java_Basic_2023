package practice_47;

import java.util.Arrays;

public class Practice {

    //наша реализация ArrayList
    private int[] array;

    //какие поля?
    private int size; //количество элементов который находиться в массиве
    private int capacity;//сколько элементов может быть в массиве (ограничение для size)


    //как определить сколько элементов в листе храниться и его вместимость (size and capacity)

    //конструктор без параметра (по умолчанию)
    public Practice() {
        //что должно быть тут?
        this.array = new int[10]; //[10] = capacity
        this.size = 0;
        this.capacity = 10;
    }

    //конструктор с параметром
    public Practice(Practice practice) {//что должно быть тут?
        this.array = practice.array;
        this.size = practice.size;
        this.capacity = practice.capacity;
    }

    //конструктор с неким числом
    public Practice(int x){//10_000
        array = new int[x];
        this.capacity = x;
        this.size = 0;
    }

    public void add(int n){ //8
        //{1, 3, 5} size = 3 capacity = 3

        if (size < capacity){
            array[size] = n;
            size++;
        } else {
            int[] temp = new int[capacity * 2];//{0, 0, 0, 0, 0, 0}
            temp = Arrays.copyOf(array, capacity * 2);//{1, 3, 5, 0, 0, 0}
            capacity = capacity * 2;
           // array = temp;
            array[size] = n;//{1, 3, 5, 8, 0, 0}
            size++;// size = 4;
        }
    }
}
