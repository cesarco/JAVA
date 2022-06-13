
    import java.util.concurrent.*;

    public class Main {
        public static void main(String[] args) {
// Create participants and resources
            Fox robin = new Fox();
            Fox miki = new Fox();
            Elephant dumbo = new Elephant();
            Food food = new Food();
// Process data
            ExecutorService service = null;
            try {
                service = Executors.newScheduledThreadPool(10);
                service.submit(() -> dumbo.eat(food));
                service.submit(() -> robin.eat(food));
                service.submit(() -> miki.eat(food));
            } finally {
                if(service != null) service.shutdown();
            }
        }
    }

    class Food {}

    class Elephant {
        public void eat(Food food) {
            synchronized(food) {
                System.out.println("Elephant got Food!");
                try {
                    Thread.sleep(60 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Fox {
        public void eat(Food food) {
            move();
            synchronized(food) {
                System.out.println("Got Food!");
            }
        }
        public void move() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Handle exception
            }
        }
    }
/*
esto sucede cuando un proceso es mas rapido y se toma el proceso por cierto tiempo, y produce que los demas
que se estan ejecutando no puedan acceder a ese recurso hasta que finalize el proceso que lo tiene
 */
