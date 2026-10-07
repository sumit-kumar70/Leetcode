class Solution {
    static final long MOD = 1000000007;

    public int numberOfWays(int startPos, int endPos, int k) {
        int d = Math.abs(endPos - startPos);

        if (d > k) {
            return 0;
        }
        if ((k - d) % 2 != 0) {
            return 0;
        }

        int right = (k + d) / 2;
        long ans = 1;

        for (int i = 1; i <= right; i++) {
            ans = ans * (k - i + 1) % MOD;
            ans = ans * modInverse(i) % MOD;
        }
 return (int) ans;
    }
    private long modInverse(long a) {
        return power(a, MOD - 2);
    }

    private long power(long a, long b) {
        long result = 1; while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a % MOD;
            }  a = a * a % MOD;
            b >>= 1;
        }
return result;
    }
}