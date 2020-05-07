package algorithms.algs;

import java.util.PriorityQueue;

public class pQueue {
    
    /**
     * this is like a list but objects are added based 
     * on a Comperator || a lambda expersion
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((int num1,int num2) -> num1 > num2); 
        queue.add(10);
        queue.add(30);
        queue.add(60);
        System.out.println(queue.toString());
    }
}