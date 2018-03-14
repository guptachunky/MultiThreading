//class MyThread1 extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 20; i++) {
//            System.out.println("run from fiorst thread " + i);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                System.out.println("Interupted");
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class MyThread2 extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 20; i++) {
//            System.out.println("run from second thread " + i);
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//public class Practice {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread2 myThread2=new MyThread2();
//        MyThread1 myThread1=new MyThread1();
//        myThread1.start();
//        myThread1.interrupt();
//        System.out.println();
////        myThread1.join();
////        myThread2.start();
//    }
//}
