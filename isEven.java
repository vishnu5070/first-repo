import java.util.Scanner;
public class even {
    int num;
    public void isEven(int a){
        if(a%2==0){
            System.out.println("given number is even");
            System.out.println("True");
        }
        else{
            System.out.println("given number is odd");
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check even :");
        int num = scanner.nextInt();
        even obj = new even();
        obj.isEven(num);
        System.out.println("Try programiz.pro");
    }
}
