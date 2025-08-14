package org.example;

public class Main {
    public static void main(String[] args) {
        // Write a while loop that prints the numbers 0 through 100, increasing by 5
        // each time.
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i = i + 5;
        }
        // Write a while loop that prints the even numbers from 2 to 40.
        int j = 2;
        while (j <= 40) {
            System.out.println(j);
            j = j + 2;
        }
        // Write a while loop that prints the phrase "Around the world" 144 times.
        int k = 0;
        while (k < 144) {
            System.out.println("Around the world");
            k++;
        }
    }
}