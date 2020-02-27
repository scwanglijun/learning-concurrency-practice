package io.marmot.learning.ch01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskStart {

    public static void main(String[] args) {
            //创建异步任务
        FutureTask<String> futureTask=new FutureTask<>(new CallerTask());
            //启动线程
         new Thread(futureTask).start();
            //等任务执行结果
        try {
            String result=futureTask.get();
            System.out.println("result:"+result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
