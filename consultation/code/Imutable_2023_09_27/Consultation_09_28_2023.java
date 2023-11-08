package Imutable_2023_09_27;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Consultation_09_28_2023 {
    // 1. immutable collections
    // 2. read and write files

    public static void main(String[] args)throws IOException {
        readFiles();
    }
    public static void readFiles() throws IOException {
        File file = new File("consultation/code/Imutable_2023_09_27/file.txt");
        if (!(file.exists() && file.isFile())){ // file.exists() - проверка, что файл существует. file.isFile() - проверка это действительно файл (НЕ ПАПКА)
            throw new RuntimeException("is it not file!");
        }

        char[] message = "Hello\ndear\nfriend!".toCharArray();

        FileOutputStream outputStream = new FileOutputStream(file); //пишет байтами
        for (char c : message) {
            outputStream.write(c);
        }



        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }

//            FileReader fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader, 2);
//            System.out.println(reader.readLine());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void tryImmutable() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        arrayList.remove("one");
        arrayList.set(1,"two");
        System.out.println(arrayList);

        List<String> immutable = List.of("one", "two", "three");
        System.out.println("immutable " + immutable);

        arrayList = Collections.unmodifiableList(arrayList); // неизменяемый
    }
}
