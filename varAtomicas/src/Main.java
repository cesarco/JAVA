import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws  Exception{
/*
        System.out.println("start");
        Thread.sleep(2000);
        System.out.println("end");

 */

        Counter counter = new Counter();
        Thread first = new Thread(counter, "First");
        Thread second = new Thread(counter, "second");

        first.start();
        second.start();

        first.join();
        second.join();

       // Thread.sleep(5000);
        System.out.println(counter.count);
    }
    static class Counter extends Thread {
        public AtomicInteger count =  new AtomicInteger(0);

        public void run(){
            for (int i = 0; i<200_000_000; i++){
                count.addAndGet(1);
            }
        }
    }
}

/*
*  Las variables atomicas son utilizadas para porder ejecutar dos procesos que esta utilizando un mismo recurso
* es decir, en este caso  que la variable count solo va a ejecutar un proceso a la vez evitar incovenientes a la
* hora de msotrar en consola. Ahi diferentes tipos variables atomicas con long, boolean entre otros.
* */