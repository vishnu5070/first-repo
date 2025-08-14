/*class Main {
    public static void main(String[] args) {
        int a=10;
        for (int i=0;i<=a;i++ ){
            for(int j=0;j<=i;j++){
                System.out.printf("* ");
            }
                System.out.println();
        }

       System.out.println("Ravi is Good Boy");
    }
}*/

/*class main {
    public static void main(String[]args){
        int a=10;
        for (int i=0;i<=a;i++){
            if(i%2==0){
                System.out.println("* *");
            }
            else{
                System.out.println("   * *");
            }
        }
    }
}*/
/*class main {
    public static void main(String[]args){
        int n=1;
        int spaces=2*(n-1);
        int stars=0;
        for (int i=0;i<=2*(n-1);i++ ){
        if(i<=n){
            spaces=spaces-2;
            stars++;
        }
        else{
            spaces=spaces+2;
            stars--;
        }
            for(int j=1;j<=stars;j++){
                System.out.printf("*");
            }
        }
        for (int j=0;j<=spaces;j++){
            System.out.println("");
        }
        for(int j=1;j<=stars;j++){
            if(j!=n){
                System.out.printf("*");
            }
        }
        System.out.println();

    }
}*/
/*import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System .out.println("enter n value: ");
        int a=sc.nextInt();
        for (int i=0;i<=a;i++ ){
            for(int k=0;k<=a;k++){
                System.out.printf("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.printf("* ");
            }
                System.out.println();
        }
        for(int k=0;k<=a;k++){
                System.out.printf(" *");
            }
            System.out.println();
       for (int i=a;i>=1;i-- ){
           for(int k=0;k<=a;k++){
                System.out.printf("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
                System.out.println();
        }
    }
}*/
import java.util.Scanner;
public class caluculator{
    void add(int a,int b){
        System.out.println("abbition of a and b :"+(a+b));
    }
    void sub(int a,int b){
        System.out.println("subtraction of a and b :"+(a-b));
    }
    void multiply(int a,int b){
        System.out.println("multiplication of a and b :"+(a*b));
    }
    //public static void main(Static[]args)
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System .out.println("enter values of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        caluculator obj = new caluculator();
        obj.add(a,b);
        obj.sub(a,b);
        obj.multiply(a,b);

    }
}

