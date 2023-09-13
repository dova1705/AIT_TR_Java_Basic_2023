package practice_39.menu_option;

import java.util.Scanner;

public class ToDoAppl {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Delete task (by number)");
            System.out.println("4. Exit");

            try {
                System.out.print("Выберите опцию в меню: ");
                int choice = Integer.parseInt(scanner.nextLine());

                MenuOption menuOption = null;
                for (MenuOption option : MenuOption.values()) {
                    if (option.getValue() == choice) {
                        menuOption = option;
                        break;
                    }
                }

                if (menuOption != null) {
                    switch (menuOption) {
                        case ADD:
                            MenuOption.addTask();
                            break;
                        case VIEW:
                            MenuOption.viewTasks();
                            break;
                        case DELETE:
                            MenuOption.deleteTask();
                            break;
                        case EXIT:
                            System.out.println("Выйдите из приложения.");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Этот параметр недопустим. Пожалуйста, выберите один из следующих вариантов.");
                            break;
                    }
                } else {
                    System.out.println("Недопустимый параметр. Пожалуйста, выберите из меню.");
                }
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Введите правильный номер опции в меню.");
            }
        }
    }
}
