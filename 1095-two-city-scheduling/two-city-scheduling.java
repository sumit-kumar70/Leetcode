
import java.util.Arrays;

class Solution {
    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs, (a, b) ->
            (a[0] - a[1]) - (b[0] - b[1])
        );

        int n = costs.length / 2;
        int total = 0;

        for (int i = 0; i < costs.length; i++) {
            if (i < n) {
                total += costs[i][0]; // City A
            } else {
                total += costs[i][1]; // City B
            }
        }

        return total;
    }
}
