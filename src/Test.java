public abstract class Test {
    abstract void toDo();
    void makeSound() {
        System.out.println("TTT!");
    }
}
class Base extends Test {

    @Override
    void toDo() {

    }
}
