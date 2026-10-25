
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
 for (int i = 0; i < n; i++) {
            int count = ((i + 1) * (n - i) + 1) / 2;     sum += arr[i] * count;
        }
  return sum;
    }
}
