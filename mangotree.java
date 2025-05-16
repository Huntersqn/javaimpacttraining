//In the kingdom of Terebinthia, Leslie Burke is so much interested in gardening and hence she plants more trees in her garden. 
//She plants trees in a rectangular fashion with the order of rows and columns and numbers the trees in a row-wise order.
//She planted the mango trees only in the 1st row, 1st column, and last column. 
//So, given the tree number, your task is to find out whether the given tree is a mango tree or not.
//Now, write a program to check whether the given number denotes a mango tree or not.
//Input Format
//Input consists of 3 integers. The first input denotes the number of rows.
//The second input denotes the number of columns. The third input denotes the tree number.

import java.util.Scanner;
public class MangoTreeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: total number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Input: tree number to check
        System.out.print("Enter tree number: ");
        int treeNum = scanner.nextInt();

        // Check if it's a mango tree
        if (isMangoTree(treeNum, rows, cols)) {
            System.out.println("Yes, it's a mango tree.");
        } else {
            System.out.println("No, it's not a mango tree.");
        }

        scanner.close();
    }

    public static boolean isMangoTree(int num, int rows, int cols) {
        // 1st row: tree numbers from 1 to cols
        if (num <= cols) return true;

        // 1st column: numbers like 1, 1+cols, 1+2*cols,...
        if ((num - 1) % cols == 0) return true;

        // last column: numbers like cols, 2*cols, 3*cols,...
        if (num % cols == 0) return true;

        return false;
    }
}


output:
 1  2  3  4  
 5  6  7  8  
 9 10 11 12  
13 14 15 16  
17 18 19 20
