//1d array
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter array values");
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        
        
    }
} 

//2d array
class Main {
        public static void main(String[] args) {
            System.out.println("Enter the array size");
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[][] arr1 = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                System.out.print(i+" "+j+ " Value : ");
               // System.out.println("enter array values");
                arr1[i][j]=sc.nextInt();
            }}
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
                System.out.println();
            }
        }
    }
    */
 /*  class Main {
        public static void main(String[] args) {
            System.out.println("Enter the array size");
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[][] arr1 = new int[n][n];
            int[][] arr2 = new int[n][n];
            int[][] arr3 = new int[n][n];
            System.out.println("enter arr1 values");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                System.out.print(i+" "+j+ " Value : ");
                arr1[i][j]=sc.nextInt();
            }}
            System.out.println("enter arr1 values");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                System.out.print(i+" "+j+ " Value : ");
                arr2[i][j]=sc.nextInt();
            }}
            System.out.print("addition of two matrices Value : ");
            System.out.print();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }}
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                System.out.print(arr3[i][j]+" ");
            }
                System.out.println();
            }
        }
    }
