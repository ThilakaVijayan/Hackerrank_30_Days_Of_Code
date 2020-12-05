package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * A level-order traversal, also known as a breadth-first search,
 * visits each level of a tree's nodes from left to right, top to
 * bottom. You are given a pointer, root, pointing to the root of
 * a binary search tree. Complete the levelOrder function provided
 * in your editor so that it prints the level-order traversal of
 * the binary search tree.
 */
class Node_2 {
    Node_2 left, right;
    int data;

    Node_2(int data) {
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

public class Day_23_BST_Level_Order_Traversal {

    static void levelOrder(Node_2 root) {
        //Write your code here
        Queue<Node_2> queue = new ArrayDeque<>();
        if (root != null)
            queue.add(root);

        while (!queue.isEmpty()) {
            Node_2 currentNode = queue.remove();
            System.out.print(currentNode.data + " ");

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public static Node_2 insert(Node_2 root, int data) {
        if (root == null) {
            return new Node_2(data);
        } else {
            Node_2 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node_2 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
