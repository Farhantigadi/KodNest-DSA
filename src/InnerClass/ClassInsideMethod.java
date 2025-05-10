package InnerClass;

class CounterManager {
    void countUp(int maxCount) {
        class Counter {
            void count() {
                for (int i = 1; i <= maxCount; i++) {
                    System.out.println("Count: " + i);
                }
            }
        }

        Counter counter = new Counter();
        counter.count();
    }
}

public class ClassInsideMethod {
    public static void main(String[] args) {
        CounterManager manager = new CounterManager();
        manager.countUp(5);
    }
}
