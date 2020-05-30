package br.com.marcelo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Item> queue = new ArrayBlockingQueue(10);


        new Thread(new Producer(queue)).start();


        new Thread(new Consumer(queue)).start();

        Thread.sleep(1000);


    }
}
