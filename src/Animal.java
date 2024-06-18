public abstract class Animal{
    protected abstract void makeSound();

    protected void move() {
        System.out.println(getClass().getSimpleName() + " is Moving.");
    }
    private  int add(int a, int b) {
        return a+b;
    }
 }

