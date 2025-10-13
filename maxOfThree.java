import java.util.Scanner;
public class even {
    int a;
    int b;
    int c;
    public void maxOfThree(int a,int b,int c){
        if(b<a){
            if(c<a){
                System.out.println(" a is greater");
            }
            else{
                System.out.println(" c is greater");
            }
        }
        else{
            if(b>c){
                System.out.println(" c is greater");
            }
            else{
                System.out.println(" b is greater");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check even :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        even obj = new even();
        obj.maxOfThree(a,b,c);
        System.out.println("Try programiz.pro");
    }
}
