package com.company;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads
 * the same backwards and forwards. Can you determine if a given string, s, is a palindrome?
 * <p>
 * To solve this challenge, we must first take each character in , enqueue it in a queue,
 * and also push that same character onto a stack. Once that's done, we must dequeue the first
 * character from the queue and pop the top character off the stack, then compare the two characters
 * to see if they are the same; as long as the characters match, we continue dequeueing, popping,
 * and comparing each character until our containers are empty (a non-match means  isn't a palindrome).
 * <p>
 * Write the following declarations and implementations:
 * <p>
 * Two instance variables: one for your , and one for your .
 * A void pushCharacter(char ch) method that pushes a character onto a stack.
 * A void enqueueCharacter(char ch) method that enqueues a character in the  instance variable.
 * A char popCharacter() method that pops and returns the character at the top of the  instance variable.
 * A char dequeueCharacter() method that dequeues and returns the first character in the  instance variable.
 */
public class Day_18_Queues_and_Stacks {
    // Write your code here.
    private char[] queue = new char[10];
    private char[] stack = new char[10];

    private int queueSize = 0;
    private int stackSize = 0;

    private int queuePointer = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day_18_Queues_and_Stacks p = new Day_18_Queues_and_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    private void enqueueCharacter(char inputChar) {
        this.queue = checkAndIncreaseArraySize(this.queue, this.queueSize);
        this.queue[this.queueSize++] = inputChar;
    }

    private char[] checkAndIncreaseArraySize(char[] array, int arraySize) {
        if (arraySize >= array.length) {
            char[] newArray = new char[arraySize + 10];
            int i = 0;
            for (char c : array) {
                newArray[i++] = c;
            }
            array = newArray;
        }
        return array;

    }

    private boolean isArrayEmpty(int arraySize, int arrayPointer) {
        return arraySize == arrayPointer;
    }

    private String stringArray(char[] array) {
        StringBuilder s = new StringBuilder();
        for (char c : array)
            s.append(c).append(",");
        return s.toString();
    }

    private char dequeueCharacter() {
        if (isArrayEmpty(this.queueSize, this.queuePointer))
            throw new EmptyStackException();
        return this.queue[this.queuePointer++];
    }

    private void pushCharacter(char c) {
        this.stack = checkAndIncreaseArraySize(this.stack, this.stackSize);
        this.stack[this.stackSize++] = c;
    }

    private char popCharacter() {
        if (stackSize <= 0)
            throw new EmptyStackException();
        return stack[--stackSize];
    }
}