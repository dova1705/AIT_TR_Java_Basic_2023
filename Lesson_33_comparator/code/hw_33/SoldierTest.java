package hw_33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {
    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        soldiers = new Soldier[5];
        soldiers[0] = new Soldier("Ivan", 170, 70, 99);
        soldiers[1] = new Soldier("Anna", 160, 60, 90);
        soldiers[2] = new Soldier("Gena", 180, 80, 80);
        soldiers[3] = new Soldier("Jack", 175, 73, 70);
        soldiers[4] = new Soldier("Paul", 155, 58, 60);

    }

    @Test
    void printArrayTest(){
        System.out.println("==================printArrayTest==================");
        Soldier.printArray(soldiers);//
    }

    @Test
    void searchTest() {
        System.out.println("==================searchTest==================");
        int indexOfSoldier = Soldier.search(soldiers, soldiers[3] = new Soldier("Jack", 175, 73, 70));
        assertEquals(3, indexOfSoldier);
    }

    @Test
    void findByPredicate() {
        System.out.println("====================findByPredicate====================");
        Soldier.printArray(soldiers);
        Soldier soldier = Soldier.findByPredicate(soldiers, soldier1 -> soldier1.getHeight() < 160);
        System.out.println(soldier);
    }
}