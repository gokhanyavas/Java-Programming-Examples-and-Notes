/**
 * Created by gokhanyavas on 26.03.2017.
 */

/*
interface Executable {

    void execute();
}

class Runner {

    public void run(Executable e) {
        System.out.println("Executing code block ...");
        e.execute();
    }
}
public class App {

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello There.");

            }
        });

        System.out.println("=======================");

        runner.run(() -> {

            System.out.println("This is code passed in a lambda expression.");
            System.out.println("Hello There.");

        });

    }
}

*/

///////////////////

/**
 * Created by gokhanyavas on 26.03.2017.
 */

interface Executable {

    int execute(int a, int b);
}

interface StringExecutable {

    int execute(String a);
}

class Runner {

    public void run(Executable e) {
        System.out.println("Executing code block ...");
        int value = e.execute(12,13);
        System.out.println("Return value is: " + value);
    }

    public void run(StringExecutable e) {
        System.out.println("Executing code block ...");
        int value = e.execute("Hello");
        System.out.println("Return value is: " + value);
    }
}
public class App {

    public static void main(String[] args) {

        int c = 100;
        // mustn't do this; c = 8;

        int d = 77;

        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello There.");
                // Can do this in methods of anonymous classes int d = 8;
                return  a + b + c;
            }
        });

        System.out.println("=======================");

        /*

        runner.run(() -> {

            System.out.println("This is code passed in a lambda expression.");
            System.out.println("Hello There.");
            return 8;
        });

         */

        /*

         runner.run(() -> {

            return 8;
        });

         */

        /*

        runner.run(() ->  8 );

         */

        // runner.run((int a) ->  8 );

        /*

        runner.run((int a) ->  {

            System.out.println("Hello There.");
            return  7 + a;
        } );

         */

        /*

         runner.run((a,b) ->  {

            System.out.println("Hello There.");
            return  7 + a;
        } );

         */

        runner.run((a,b) ->  {

            System.out.println("Hello There.");
            // Can't do this; no new scope int d = 99;
            return  a + b + c;
        } );

        System.out.println("=======================");

        Executable ex = (a,b) ->{
            System.out.println("Hello There.");
            // Can't do this; no new scope int d = 99;
            return  a + b + c;
        };

        runner.run(ex);

        Object codeblock = (Executable)(a,b) -> {
            System.out.println("Hello There.");
            // Can't do this; no new scope int d = 99;
            return  a + b + c;
        };

    }
}
