class Main {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int n=15;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c+" ");
        }
    }
} 
