class Solution {
    public String solveEquation(String equation) {
        String[] s = equation.split("=");
        int x = 0, n = 0;
for (int k = 0; k < 2; k++) {
            int sign = (k == 0) ? 1 : -1;
            String str = s[k];
            int i = 0, sg = 1;while (i < str.length()) {
                if (str.charAt(i) == '+') { sg = 1; i++; }
                else if (str.charAt(i) == '-') { sg = -1; i++; }int num = 0, start = i;
                while (i < str.length() && Character.isDigit(str.charAt(i)))
                    num = num * 10 + str.charAt(i++) - '0';
if (i < str.length() && str.charAt(i) == 'x') {
                    x += sign * sg * (i == start ? 1 : num);
                    i++;} else {   n += sign * sg * num;
                }   }
        } if (x == 0) return n == 0 ? "Infinite solutions" : "No solution";
        return "x=" + (-n / x);
    }
}