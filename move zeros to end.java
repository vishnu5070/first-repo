import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size=sc.nextInt();
        int[] arr1=new int[size];
        System.out.println("enter the array values");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(" sorted elements ");
        //int [] arr1={0,1,0,2,3,4,5,6};
        //size=arr.length;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0)
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==0)
            System.out.print(arr1[i]+" ");
        }
    }
}
