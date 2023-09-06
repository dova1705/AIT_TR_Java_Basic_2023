package inheritance_practice.bank.model;

public class BankAccount {
    //поля класса
    private long account;//номер счета
    private String owner; //владелец счета
    private String bank; //банк
    private int branch; //филлиал
    private double balance; //баланс

    //Методы класса
    //конструктор класса (Alt + ins на windows)
    public BankAccount(long account, String owner, String bank, int branch, double balance) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

    //конструктор бeз баланса
    public BankAccount(long account, String owner, String bank, int branch) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
    }

    //конструктор без владельца
    public BankAccount(long account, String bank, int branch, double balance) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

    //добавляем денег
    public void deposit (double sum){
        balance = balance + sum; //добавили деньги на счет
    }

    //снимаем деньги со счета
    public boolean withdraw (double sum) {
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }
        return false;
    }
    //снимаем деньги со счета реализован через тип void на практике хорошо показал себя тип boolean
   /*
    public void withdraw (double sum) {
        if (sum <= balance) {
            balance = balance - sum;
            System.out.println("операция прошла успешно");
        } else {
            System.out.println("Вы ввели сумму больше чем баланс");
        }

    }
    */

    //геттеры и сетторы
    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display (){
        System.out.println("номер счета " + account + ", владелец счета " + owner + ", банк " + bank + ", филиал " + branch + ", баланс " + balance);

    }
}
