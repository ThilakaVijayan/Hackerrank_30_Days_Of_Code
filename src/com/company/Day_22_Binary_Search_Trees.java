package com.company;

import java.util.Scanner;

/**
 * The height of a binary search tree is the number of edges between the
 * tree's root and its furthest leaf. You are given a pointer, root,
 * pointing to the root of a binary search tree. Complete the getHeight
 * function provided in your editor so that it returns the height of
 * the binary search tree.
 */
class Node_1 {
    Node_1 left, right;
    int data;

    Node_1(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Day_22_Binary_Search_Trees {

    public static int getHeight(Node_1 root) {
        //Write your code here
        return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static Node_1 insert(Node_1 root, int data) {
        if (root == null) {
            return new Node_1(data);
        } else {
            Node_1 cur;
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
        Node_1 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
