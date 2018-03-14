public class Question3 {
    public static void print1() {
        for (int i = 0; i < 3; i++) {
            System.out.print(" 1 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void print2() {
        for (int i = 0; i < 3; i++) {

            System.out.print(" 2 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void print3() {
        for (int i = 0; i < 3; i++) {

            System.out.print(" 3 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> print1());
        Thread t2 = new Thread(() -> print2());
        Thread t3 = new Thread(() -> print3());
        t1.start();
        t2.start();
        t3.start();

    }
}
