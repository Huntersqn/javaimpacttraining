An oil factory has N number of containers and each has a different capacity. During renovation, the manager decided to make some changes with the containers. He wishes to make different pairs for the containers in such a way that in the first pair, the container of maximum capacity is paired with the container of minimum capacity, and so on for the rest of the containers, to maintain a balance throughout all the pairs of containers.
Write an algorithm to make different pairs of containers in such a way that the first container in the pair is of maximum capacity and second container in the pair is of minimum capacity.

import java.util.Arrays;

public class ContainerPairing {
    public static void makeBalancedPairs(int[] capacities) {
        Arrays.sort(capacities); // Sort capacities in ascending order
        int n = capacities.length;

        for (int i = 0; i < n / 2; i++) {
            int min = capacities[i];
            int max = capacities[n - 1 - i];
            System.out.println("Pair: " + max + " - " + min);
        }

        // If odd number of containers, one remains unpaired
        if (n % 2 != 0) {
            System.out.println("Unpaired container: " + capacities[n / 2]);
        }
    }

    public static void main(String[] args) {
        int[] containers = {40, 10, 30, 70, 50, 20}; // Sample capacities
        makeBalancedPairs(containers);
    }
}


output:
Pair: 70 - 10
Pair: 50 - 20
Pair: 40 - 30

