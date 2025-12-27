class Main {
    public static void main(String[] args) {
        int add =0;
        int mul=1;
        for(int i=1;i<=20;i++){
            if(i%2==0){
                add=add+i;
                System.out.print(i + "+");
            }
            else{
                mul=mul*i;
            }
        }
        System.out.println("="+add);
        System.out.println(mul);
    }
}
