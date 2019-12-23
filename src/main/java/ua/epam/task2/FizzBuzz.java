package ua.epam.task2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBuzz {

    private int value;
    private AtomicInteger counter = new AtomicInteger(1);
    private Semaphore fizzSemap = new Semaphore(1);
    private Semaphore buzzSemap = new Semaphore(1);
    private Semaphore fizzBuzzSemap = new Semaphore(1);
    private Semaphore numberSemap = new Semaphore(1);

    public FizzBuzz(int value) {
        this.value = value;
    }

    public void fizz(){
        while (counter.get() < value){
            try {
                fizzSemap.acquire();
            } catch (InterruptedException e){
                System.out.println(e);
            }
            if(counter.get() % 3 == 0 && counter.get() % 5 != 0){
                System.out.print("fizz ");
                counter.incrementAndGet();
                releaseAll();
            }
        }
    }
    public void buzz(){
        while (counter.get() < value){
            try {
                buzzSemap.acquire();
            } catch (InterruptedException e){
                System.out.println(e);
            }
            if(counter.get() % 3 != 0 && counter.get() % 5 == 0){
                System.out.print("buzz ");
                counter.incrementAndGet();
                releaseAll();
            }
        }

    }
    public void fizzbuzz(){
        while (counter.get() < value){
            try {
                fizzBuzzSemap.acquire();
            } catch (InterruptedException e){
                System.out.println(e);
            }
            if(counter.get() % 3 == 0 && counter.get() % 5 == 0){
                System.out.print("fizzbuzz ");
                counter.incrementAndGet();
                releaseAll();
            }
        }
    }

    public void number(){
        while (counter.get() < value){
            try {
                numberSemap.acquire();
            } catch (InterruptedException e){
                System.out.println(e);
            }
            if(counter.get() % 3 != 0 && counter.get() % 5 != 0){
                System.out.print(counter.get() + " ");
                counter.incrementAndGet();
                releaseAll();
            }
        }
    }
    public void releaseAll(){
        buzzSemap.release();
        numberSemap.release();
        fizzBuzzSemap.release();
        fizzSemap.release();
    }
}
