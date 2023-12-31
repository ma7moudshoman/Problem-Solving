package com.example.proplem_solving;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack<String> s = new Stack<>();
        s.push("car1");
        s.push("care2");
        s.push("car3");
        System.out.println("stack ---> " + s );
        s.pop();
        System.out.println("stack ---> " + s );
        Queue<String> q = new LinkedList<>();
        q.add("car1");
        q.add("care2");
        q.add("care3");
        System.out.println("Queue ---> "  + q);
        q.remove();
        System.out.println("Queue ---> "  + q);

    }

    }

