package practice_58;

public class StudentCode3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("1 Thread + " + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread1.start();


        //thread1.join(3000); //равносильна Thread.sleep(3000);
        thread1.join(); //основной поток main дождется, когда поток thread1 завершиться полностью и только после этого
        //продолжит свою работу

        for (int i = 0; i < 5; i++) {
            System.out.println("2 Main + " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
