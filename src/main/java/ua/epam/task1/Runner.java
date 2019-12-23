package ua.epam.task1;

public class Runner {
    public static void main(String[] args) {
        Foo foo = new Foo();
        MyThread threadFirst = new MyThread(1, foo);
        MyThread threadSecond = new MyThread(2, foo);
        MyThread threadThird = new MyThread(3, foo);

        threadSecond.start();
        threadThird.start();
        threadFirst.start();
    }
}
