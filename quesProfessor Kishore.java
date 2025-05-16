ques:Professor Kishore wanted the kids to learn about Special numbers. (A two-digit number is said to be a special number if the sum of sum of its digits and the product of its digits is equal to the number itself. For example, 19 is a special number. The digits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9. 10+9 = 19.)

Can you help Kishore to write a program to find all special numbers between 2 limits m and n (both inclusive)? Assume that m and n are two-digit numbers.


public class SpecialNumberFinder {
    public static void main(String[] args) {
        System.out.println("Special two-digit numbers are:");
        for (int number = 10; number < 100; number++) {
            int tens = number / 10;
            int units = number % 10;
            int sum = tens + units;
            int product = tens * units;

            if (sum + product == number) {
                System.out.println(number);
            }
        }
    }
}

output:
Special two-digit numbers are:
19
29
39
49
59
69
79
89
