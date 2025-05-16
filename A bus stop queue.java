A bus stop queue has 'n' groups of people. The i-th group from the beginning has 'ai' people. Every 30 minutes an empty bus arrives at the bus stop, it can carry atmost 'm' people. Naturally, the people from the first group enter the bus first. Then goes the people from the second group and so on. Note that the order of groups in the queue never changes. Moreover, if some group cannot fit all of its members into the current bus, it waits for the next bus and joins with the other groups standing after them in the queue. Your task is to determine the number of buses needed to transport all 'n' groups to the Jeju Island countryside.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of groups and bus capacity
        int n = sc.nextInt(); // number of groups
        int m = sc.nextInt(); // bus capacity

        int[] groups = new int[n];
        for (int i = 0; i < n; i++) {
            groups[i] = sc.nextInt(); // number of people in each group
        }

        int busCount = 1; // start with 1 bus
        int currentLoad = 0;

        for (int i = 0; i < n; i++) {
            if (groups[i] > m) {
                System.out.println("Group size exceeds bus capacity!");
                return;
            }

            if (currentLoad + groups[i] <= m) {
                currentLoad += groups[i];
            } else {
                busCount++;
                currentLoad = groups[i];
            }
        }

        System.out.println("Number of buses needed: " + busCount);

        sc.close();
    }
}

input:
5 10
2 3 5 4 2
output:
3

