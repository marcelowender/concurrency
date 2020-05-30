package br.com.marcelo;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {


    private BlockingQueue<Item> queue;

    public Consumer(BlockingQueue<Item> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Fila Atual inico consumer" + queue.size());
                Item item = queue.take();
                System.out.println("Fila Atual fim consumer" + queue.size());
                System.out.println("#########");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
