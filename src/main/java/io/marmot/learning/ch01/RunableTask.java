package io.marmot.learning.ch01;

public class RunableTask  implements Runnable{

    @Override
    public void run() {
        System.out.println("I am a child thread");
    }
}
