public abstract class Test {
    abstract void toDo();
    void makeSound() {
        System.out.println("TTT!");
    }
}
class Base extends Test {

    static int counter = 0;
    public static final String BUT = "TTT";

    static void printMessage(String str) {
        System.out.println(str);
    }

    @Override
    void toDo() {

    }
}
