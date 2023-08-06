package com.levochka108.mvc;


import com.levochka108.mvc.list.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);

        System.out.println("Исходный односвязный список:");
        linkedList.display();

        linkedList.reverse();

        System.out.println("Односвязный список после разворота:");
        linkedList.display();
    }


}