package polo.practice;

import java.util.concurrent.Executor;

public class Main {

    public static void main(String[] args) {

        Executor executor = new Invoker();

        executor.execute(() -> {
            System.out.println("Printing inside runnable");
        });

    }
}
