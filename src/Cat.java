public class Cat extends Animal{
    @Override
    public void makeSound()   { // this method override happens at run time.
        System.out.println("Meow....");
    }

    @Override
    protected void move() {

    }
}
