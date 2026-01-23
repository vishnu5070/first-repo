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
