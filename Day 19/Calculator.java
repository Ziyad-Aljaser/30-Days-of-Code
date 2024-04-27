class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int result = n;
        if (result != 1) {
            result += 1;
        }
        // Without 1 or n
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                result += i;
                if (i != n / i) { 
                    result += (n/i);
                }
            }
        }
        return result;
    }
}
