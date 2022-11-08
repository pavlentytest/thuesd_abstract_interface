public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Base base = new Base();

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
