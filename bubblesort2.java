class Main {
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1,1};
        int temp;
        int large;
        int small;
        for(int i=0;i<=5;i++){
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }}
        for(int i=0;i<=5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(" Largest two numbers sum");
        System.out.println(arr[arr.length-1]+arr[arr.length-2]);
        System.out.println(" smallest two numbers sum");
        System.out.println(arr[0]+arr[1]);
    }
}
