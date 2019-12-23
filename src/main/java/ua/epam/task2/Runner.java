package ua.epam.task2;

public class Runner {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        MyThread threadFizz = new MyThread(1, fizzBuzz);
        MyThread threadBuzz = new MyThread(2, fizzBuzz);
        MyThread threadFizzBuzz = new MyThread(3, fizzBuzz);
        MyThread threadFNumber = new MyThread(4, fizzBuzz);

        threadFizz.start();
        threadBuzz.start();
        threadFizzBuzz.start();
        threadFNumber.start();
    }
}
