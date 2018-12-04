package com;

import java.util.*;

public class Main {
    public static void main(String[] args) {
/*        Stack<String> stack=new Stack<>();
        stack.add("one");
        stack.push("two");

        System.out.println(stack.pop());
        System.out.println(stack.pop());*/

        /*Queue<String> queue=new PriorityQueue<>();
        queue.add("one");
        queue.offer("two");
        queue.remove();
        String str=queue.peek();
        System.out.println(str );
        for (String s:queue) {
            System.out.println(s);

        }*/
        Deque<String> deque = new ArrayDeque<>();
        Deque<String> deque2 = new LinkedList<>();

        deque.add("one");
        deque.offer("two");
        deque.addLast("three");
        deque.offerLast("four");
        deque.addFirst("zero");
        deque.offerFirst("minus one");
        deque.push("minus two");

       String s1= deque.removeLast();
        String s2= deque.getLast();
        String s3= deque.peekLast();
        String s4= deque.pollLast();

        String s5=deque.remove();
        String s6= deque.removeFirst();
        String s7=deque.pop();

        String s8=deque.element();
        String s9= deque.getFirst();
        String s10=deque.peek();
        String s11=deque.peekFirst();

        String s12=deque.poll();
        String s13= deque.pollFirst();


        for (String s : deque) {
            System.out.println(s);
        }

        deque.removeLast();
    }
}




