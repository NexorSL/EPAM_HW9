package ua.epam.task2;

public class MyThread extends Thread {
    int selector = 0;
    FizzBuzz fizzBuzz;

    public MyThread(int selector, FizzBuzz fizzBuzz) {
        this.selector = selector;
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        switch (selector){
            case 1:
                fizzBuzz.fizz();
                break;
            case 2:
                fizzBuzz.buzz();
                break;
            case 3:
                fizzBuzz.fizzbuzz();
                break;
            case 4:
                fizzBuzz.number();
                break;
        }
    }
}
