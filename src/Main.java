import java.io.IOException;
import java.security.spec.ECField;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
       Thread thread1 = new Thread(new MyRunnable(counter));
       Thread thread2 = new Thread(new MyRunnable(counter));

       thread1.start();

       thread2.start();

       try {
           thread1.join(); //wait for thread1 to finish
           thread2.join(); // wait for thread2 to finish
       }
       catch (InterruptedException e) {
           e.printStackTrace();
       }

        System.out.println("Finally completed with count " + counter.getCount());
    }


    int returnHelper() {
        int a = 10;
        int b = 5;
        return a/b;

    }
    public static void helper () {


        try {
            int [] arr = new int [10];
            arr[12] = 13;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound exception in outer loop");
            try {
                int a = 10;
                int b = 0;
                int c = a / b;
            }
            catch (ArithmeticException ex){
                System.out.println("Division by o has occured in innner try catch block");
                int [] arr = new int [10];
                arr[12] = 13;

            }
            finally {
                System.out.println("all exceptions are handled");
            }
        }

//        int a = 5;
//        int b = 0;
//
//        try{
//            try{
//                a = a / b;
//            }finally{
//                System.out.print("B");
//            }
//        }catch(ArithmeticException e){
//            System.out.print("A");
//        }


    }


    public static void quiz1() {
        try {
            throw new NumberFormatException();
        }
        catch (ArithmeticException e)
        {
            System.out.println("A");
        }
        catch (NumberFormatException e) {
            System.out.println("B");
        }
        catch (Exception e) {
            System.out.println("D");
        }
        finally { // it will always get executed
            System.out.println("C");
        }
    }

    public static void quiz2() {
        int a = 5;
        int b = 0;

        try{
            try{
                a = a / b;
            }finally{
                System.out.print("B");
            }
        }catch(ArithmeticException e){
            System.out.print("A");
        }
    }

    public static void quiz3() {
        int a = 1;
        int b = 0;

        try{
            System.out.print(a/b);
        }catch(ArithmeticException|NullPointerException e){
            System.out.print("A");
        }
    }


    public static int quiz4() {
        int a = 1;
        int b = 0;

        try{
            System.out.print(a/b);
        }catch(ArithmeticException|NullPointerException e){
            System.out.println(a);
            return a;
        }
        finally {
            a++;
            System.out.print(a);
            return a;
        }
    }

    public void quiz5() {
        String str = "#^6";
        try{
            int i = Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            System.out.println("A");
        }
        catch (ArithmeticException e){
            System.out.println("B");
            return;
        }
        catch (Exception e){
            System.out.println("C");
        }
        finally{
            System.out.println("D");
        }
        System.out.println("E");
    }

    public int quiz6() {
        int value = 0;
        try {
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            value = 1;
            return value;
        } finally {
            System.out.println("Finally");
            value += 1;
            return value;
        }
    }
    // B A


}