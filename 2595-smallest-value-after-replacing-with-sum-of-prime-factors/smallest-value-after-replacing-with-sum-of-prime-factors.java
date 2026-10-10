class Solution {
    public int smallestValue(int n) {
        while (true) {
            int sum = 0, x = n;
 for (int i = 2; i * i <= x; i++) {
                while (n % i == 0) {
                    sum += i;
                    n /= i;
                } }
  if (n > 1) sum += n;
if (sum == x) return n = x; n = sum;
             }
    }
}