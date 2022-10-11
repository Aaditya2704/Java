// DUTCH NATIONAL FLAG ALGORITHM

import java.util.Scanner;

public class CountSort {
    static void sortArray(int a[], int size) {
        int temp;
        int low = 0;
        int mid = 0;
        int high = size - 1;
        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;

                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;

                    high--;
                    break;
            }
        }
    }

    static void printArray(int a[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            // LOGIC
            sortArray(a, size);
            printArray(a, size);

        }
    }
}
/*
 * Maintain a three pointer so low,mid,high
 * intialize low=0;mid=0;high=size-1;
 * take while loop run until mid < high
 * use switch case for each 0,1,2;
 * if mid==0 then it swap it's element with the element on the low index and
 * increment low and mid pointer
 * if mid==1 then just increment the pointer
 * if mid==2 then swap it's element with the element on the high index and
 * decrement the high pointer
 */