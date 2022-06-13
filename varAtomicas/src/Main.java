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
        Thread.sleep(5000);
        System.out.println(counter.count);
    }
    static class Counter extends Thread {
        public int count = 0;

        public void run(){
            for (int i = 0; i<200_000_000; i++){
                count++;
            }
        }
    }
}
