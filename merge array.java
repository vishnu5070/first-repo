class Main {
    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int[] arr2 ={4,5};
        int temp;
        float sol=0;
        int totalLength = arr1.length + arr2.length;
        int[] arr3=new int[totalLength];
        for(int i=0;i<arr1.length ;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length ;i++){
            arr3[arr1.length+i]=arr2[i];
        }
         for(int i=0;i<arr3.length ;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr3.length;i++){
            sol=sol+arr3[i];
        }
        System.out.println(sol/2);
    }
}
