public class Dog extends  Animal{
    @Override
    public void makeSound()   { // this method override happens at run time.
        System.out.println("Woof....");
    }

    @Override
    protected void move() {

    }
}
