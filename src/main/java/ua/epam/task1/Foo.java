package ua.epam.task1;

public class Foo {

    boolean secondReady = false;
    boolean thirdReady = false;

    public synchronized void first(){
        print("first");
        secondReady = true;
        notifyAll();
    }
    public synchronized void second(){
        while (!secondReady){
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
        print("second");
        thirdReady = true;
        notify();
    }
    public synchronized void third(){
        while (!thirdReady){
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
        print("third");
        notify();
    }


    public void print(String message){
        System.out.print(message);
    }
}
