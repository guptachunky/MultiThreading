

public class Question1 {

    public static void printOdd() throws InterruptedException {
        int num = 1;
        for (int i = num; i <= 10; i = i + 2) {
            System.out.println("Odd  =" + i);
            Thread.sleep(500);
        }
    }

    public static void printEven() throws InterruptedException {

        int num = 0;
        for (int i = num; i <= 10; i = i + 2) {
            System.out.println("Even =" + i);
            Thread.sleep(500);
        }
    }

    public static void main(String[] args) {
        Question1 oep = new Question1();
        Thread t1 = new Thread(() -> {
            try {
                printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start();
        t1.start();

    }
}
