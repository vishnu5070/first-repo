import java.util.Scanner;
class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {70,50,20,30,40,10};
        int size = arr.length;
        int temp;
        System.out.println("Vishnu");
        for (int i=0;i<size-1;i++) {
            for (int j=0;j<size-1-i;j++) {
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
