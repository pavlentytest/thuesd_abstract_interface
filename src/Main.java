public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        Base base = new Base();

        base.printMessage("Hello");
        Base.printMessage("ura!");
        Base.counter++; // 1

        Base base2 = new Base();
        System.out.println(base2.counter); // 1
        base2.counter++;

        Base.BUT = "3333";

        Math.PI

        //Main.main();
        Math.sin(0);


        Calculable calc = new Calculable();

        Calculable calc2 = (a, b) -> a+b;
        System.out.println(calc2.action(3,4));

        int a = 100;
        // Wrapper class
        // int => Integer
        Integer b = 200;
        a = b;
        b = a;
        // double => Double
        // boolean => Boolean
        // char => Character
        //...
        String str = "123";
        int x = Integer.parseInt(str); // 123
        String result = Integer.toString(a);  // "100"


    }
}
