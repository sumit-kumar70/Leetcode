class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2, sum = 0;
 for (int x = 1; x <= n; x++) {
 sum += x;
            if (sum * 2 == total + x)
                return x;
                 }return -1; }
}