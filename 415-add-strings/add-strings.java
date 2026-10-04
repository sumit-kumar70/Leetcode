class Solution {
    public String addStrings(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        String ans = "";
 while (i >= 0 || j >= 0 || carry > 0) {
            int x = i >= 0 ? a.charAt(i--) - '0' : 0;
            int y = j >= 0 ? b.charAt(j--) - '0' : 0;
 int sum = x + y + carry;
            ans = (sum % 10) + ans;
            carry = sum / 10; }
 return ans;
    }
}