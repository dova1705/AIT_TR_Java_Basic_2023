package practice_33.computer.controller;

import practice_33.computer.model.Computer;

public class ComputerCompareAppl {
    public static void main(String[] args) {
        Computer comp1 = new Computer("i5", 8, 256, "HP");
        Computer comp2 = new Computer("i5", 8, 256, "HP");

        System.out.println(comp1 == comp2);

        System.out.println(comp1.equals(comp2));

        Computer comp3 = new Computer("i5", 8, 256, "Dell");
        System.out.println(comp1.equals(comp3));

        Computer[] arrOfComps = new Computer[5];
        arrOfComps[0] = comp1;
        arrOfComps[1] = comp2;
        arrOfComps[2] = comp3;


        Computer comp4 = new Computer("i7", 16, 512, "Asus");
        Computer comp5 = new Computer("i7", 8, 256, "ASUS");

        arrOfComps[3] = comp4;
        arrOfComps[4] = comp5;

        printArray(arrOfComps); //вызов метода, печатаем массив объектов

        //сложим все ssd
        int sum = 0;
        for (int i = 0; i < arrOfComps.length; i++) {
            sum = sum + arrOfComps[i].getSsd();
        }
        System.out.println("Total SSD memory: " + sum);
    }
    //____________Methods__________

       //печать массива
    public static void printArray(Computer[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
