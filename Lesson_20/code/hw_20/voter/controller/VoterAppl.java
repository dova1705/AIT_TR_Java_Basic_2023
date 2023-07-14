package hw_20.voter.controller;

import hw_20.voter.model.Voter;

public class VoterAppl {
    public static void main(String[] args) {
        Voter voter = new Voter("Вася", "Проспект победы", 17);
        Voter voter1 = new Voter("Петя", "ул. Пушкинская", 18);
        Voter voter2 = new Voter("Маша", "ул.Советская", 19);


        System.out.println(voter);
        System.out.println(voter2);

    }
}
