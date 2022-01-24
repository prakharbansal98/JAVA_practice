package com.company;

public class LRUCache {

    Queues queue= new  Queues(5);

    public void set(Integer i){
        if(queue.contains(i)){
            queue.remove(i);
        }
        if(queue.isFull()) {
            queue.dequeue();
        }
        queue.enqueue(i);


    }

    public static void main(String[] args) {

        LRUCache lru = new LRUCache();
        lru.set(1);
        lru.set(2);
        lru.set(3);
        lru.set(4);
        lru.set(5);

        System.out.println(lru.queue.q);

        lru.set(6);
        System.out.println(lru.queue.q);
        lru.set(4);
        System.out.println(lru.queue.q);
    }

}
