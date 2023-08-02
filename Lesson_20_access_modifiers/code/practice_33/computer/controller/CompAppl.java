package practice_33.computer.controller;

import practice_33.computer.model.Comp;

public class CompAppl {
    public static void main(String[] args) {
        Comp com1 = new Comp();
        com1.setCpu("AMD");
        com1.setRam(-16);
        com1.setSsd(-512);
        System.out.println(com1.toString());

        com1.computerTurnOn();
        System.out.println(com1);

        Comp com2 = new Comp("i9", 16, 512, "HP", "off");
    }
}
