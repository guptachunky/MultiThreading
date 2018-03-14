import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Question10 {
    public static Integer sharedCounter=0;
    public static Integer temp=0;

    public static boolean lockAvailable = true;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(2);

        for(int i=0;i<5;i++){
            Runnable t = new SharedVariableThread();
            service.execute(t);
        }
        service.shutdown();

        while(!service.isTerminated()){

        }

        System.out.println("Counter: "+ Question10.sharedCounter);

    }
}

class SharedVariableThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            increment();
        }
        System.out.println(Thread.currentThread().getName()+" : "+ Question10.sharedCounter);
    }
    void increment(){
        synchronized (Question10.temp){
            while(Question10.lockAvailable!=true){
                try {
                    Question10.temp.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Question10.lockAvailable = false;

            Question10.sharedCounter= Question10.sharedCounter+1;
            Question10.lockAvailable = true;
            Question10.temp.notify();

        }

    }

}