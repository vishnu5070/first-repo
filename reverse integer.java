import java.util.Scanner;
class Solution {
    public int reverse(int x) {
        B rev = 0;

        while (x != 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check reverse or not ");
        int x=sc.nextInt();
        Solution obj =new Solution();
        obj.reverse(x);
    }
}
/*# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 ||
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }
        return rev;
    }
}*/
