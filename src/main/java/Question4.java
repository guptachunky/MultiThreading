class MyThread1 extends Thread {
    @Override
    public void run() {
        MyThread2 t2=new MyThread2();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        MyThread3 t3=new MyThread3();
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 2");
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 3");
    }
}

public class Question4 {
    public static void main(String[] args) {
//        Thread t1=new Thread(()->{
//            Thread t2=new Thread(()->{
//
//                Thread t3=new Thread(()->{
//
//                    System.out.println("Thread 3");
//                });
//
//                System.out.println("Thread 2");
//            });
//            System.out.println("Thread 1");
//        });
        MyThread1 t1 = new MyThread1();
        t1.start();


    }
}
