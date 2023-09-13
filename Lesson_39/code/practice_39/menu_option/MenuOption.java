package practice_39.menu_option;

import java.util.Scanner;

public enum MenuOption {
    ADD(1),
    VIEW(2),
    DELETE(3),
    EXIT(4);

    private final int value;

    MenuOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    static final String[] todoList = new String[100];
    static int taskCount = 0;
    static final Scanner scanner = new Scanner(System.in);

    public static void addTask() {
        if (taskCount < todoList.length) {
            System.out.print("Введите новую задачу: ");
            String task = scanner.nextLine();
            todoList[taskCount] = task;
            taskCount++;
            System.out.println("Добавлена задача.");
        } else {
            System.out.println("Список задач завершен.");
        }
    }

    public static void viewTasks() {
        if (taskCount == 0) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("Список задач:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + todoList[i]);
            }
        }
    }

    public static void deleteTask() {
        viewTasks();
        try {
            System.out.print("Введите номер задачи, которую вы хотите удалить: ");
            int taskNumber = Integer.parseInt(scanner.nextLine());

            if (taskNumber >= 1 && taskNumber <= taskCount) {
                String deletedTask = todoList[taskNumber - 1];

                for (int i = taskNumber - 1; i < taskCount - 1; i++) {
                    todoList[i] = todoList[i + 1];
                }
                todoList[taskCount - 1] = null;
                taskCount--;

                System.out.println("Задача '" + deletedTask + "' удаленный.");
            } else {
                System.out.println("Неверный номер задачи.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Введите правильный номер задачи.");
        }
    }
}
