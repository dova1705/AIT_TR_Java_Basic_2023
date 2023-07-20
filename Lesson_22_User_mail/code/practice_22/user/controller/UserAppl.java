package practice_22.user.controller;

import practice_22.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("username@mail.ru", "!Dova17!");
        System.out.println(user);
    }
}
