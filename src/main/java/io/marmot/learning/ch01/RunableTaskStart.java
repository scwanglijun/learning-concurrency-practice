package io.marmot.learning.ch01;

public class RunableTaskStart {

    public static void main(String[] args) {
        RunableTask runableTask=new RunableTask();
        new Thread(runableTask).start();
        new Thread(runableTask).start();

    }
}
