class Solution {
    static final long MOD = 1000000007;

    public int maxNiceDivisors(int primeFactors) {
        if (primeFactors <= 3) return primeFactors;

        long a = primeFactors / 3;
        int b = primeFactors % 3;

        if (b == 0) return (int) power(3, a);
        if (b == 1) return (int) (power(3, a - 1) * 4 % MOD);
        return (int) (power(3, a) * 2 % MOD);
    }

    long power(long x, long n) {
        long res = 1;
        while (n > 0) {
            if (n % 2 == 1) res = res * x % MOD;
            x = x * x % MOD;
            n /= 2;
        }
        return res;
    }
}