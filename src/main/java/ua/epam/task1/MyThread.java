package ua.epam.task1;

public class MyThread extends Thread{
    int selector = 0;
    Foo foo;

    public MyThread(int value, Foo foo) {
        this.selector = value;
        this.foo = foo;
    }

    @Override
    public void run() {
        switch (selector){
            case 1:
                foo.first();
                break;
            case 2:
                foo.second();
                break;
            case 3:
                foo.third();
                break;
        }
    }
}
