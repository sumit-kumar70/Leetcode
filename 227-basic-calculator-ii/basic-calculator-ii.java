
class Solution {
    public int calculate(String s) {
        int num = 0;        int last = 0;
 int result = 0;
        char operator = '+';
 for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
   if ((!Character.isDigit(ch) && ch != ' ') 
                || i == s.length() - 1) {

                if (operator == '+') {
                    result += last;
                    last = num;                } 
        else if (operator == '-') {
                    result += last;
                    last = -num;
                } 
                else if (operator == '*') {
                    last = last * num;
                }       else if (operator == '/') {        last = last / num;
                }  operator = ch;
                num = 0;
            }
        }  return result + last;
    }
}
