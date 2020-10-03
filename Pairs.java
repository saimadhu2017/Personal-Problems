import java.util.Scanner;

public class Pairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ncr=fac(n)/(fac(2)*fac(n-2));
        int p=ncr/2;
        int c=0;
        int X=0,Y=0;
        for(int i=1;i<=ncr;i++){
            Y++;
            c++;
            System.out.println(arr[X]+","+arr[Y]);
            if(c==p){
                p--;
                c=0;
                X++;
                Y=X;
            }
        }
        sc.close();
    }
    static int fac(int n){
        if(n==1){return(1);}
        else{return(n*fac(n-1));}
    }
}
