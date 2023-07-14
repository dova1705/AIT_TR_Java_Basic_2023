package inheritance_practice.bank.controller;

import inheritance_practice.bank.model.BankAccount;
public class BankAppl {

    public static void main(String[] args) {


        //acc1 - объектная переменная, в которой собраны все поля класса и их значения
        BankAccount acc1 = new BankAccount(1000L, "Dova", "Revolut", 102, 100);
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getOwner());
        acc1.display();

        //внести деньги на депозит
        acc1.deposit(500); // acc1 вырос баланс
        acc1.display();
        acc1.withdraw(100); //acc1 минус баланс
        acc1.display();
        acc1.withdraw(200); //acc1 минус баланс
        acc1.display();
        acc1.withdraw(400);
        acc1.display();

        System.out.println("----------------------------------------------------------------------------");
        BankAccount acc2 = new BankAccount(1000L, "Mikhail", "Revolut", 102);
        acc2.display();
        BankAccount acc3 = new BankAccount(2000L, "Artem", "Revolut", 102);
        acc3.display();
        BankAccount acc4 = new BankAccount(3000L, "Revolut", 102, 1000);
        acc4.display();

    }
}
