package br.com.marcelo;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Item> queue;

    public Producer(BlockingQueue<Item> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put(new Item("New Item"));
                queue.put(new Item("New Item"));
                queue.put(new Item("New Item"));
                System.out.println("Fila Atual producer" + queue.size());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
