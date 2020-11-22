package com.company;

import java.util.Scanner;

/**
 * Complete the insert function in your editor so that it creates a new Node
 * (pass data as the Node constructor argument) and inserts it at the tail of
 * the linked list referenced by the head parameter. Once the new node is added,
 * return the reference to the head node.
 */
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day_15_Linked_List {

    public static Node insert(Node head, int data) {
        //Complete this method
        Node node = new Node(data);

        if (head == null)
            return node;

        Node currentNode = head;

        while (currentNode.next != null)
            currentNode = currentNode.next;

        currentNode.next = node;
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
