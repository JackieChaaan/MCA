class FibonacciGenerator implements Runnable {
    private int n;

    public FibonacciGenerator(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

class EvenNumberPrinter implements Runnable {
    private int start, end;

    public EvenNumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("\nEven Numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        int fibonacciCount = 10;
        int evenStart = 1;
        int evenEnd = 20;

        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(fibonacciCount);
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter(evenStart, evenEnd);

        Thread fibonacciThread = new Thread(fibonacciGenerator);
        Thread evenThread = new Thread(evenNumberPrinter);

        fibonacciThread.start();
        evenThread.start();
    }
}

