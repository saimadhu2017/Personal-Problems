import java.util.*;
class SumOfAreas{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] plots=new int[n];
        int[] costPerUnitArea=new int[n];
        for(int i=0;i<n;i++){
            plots[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            costPerUnitArea[i]=sc.nextInt();
        }
        ///Actual code
        int cost=0;
        int costbyUnitArea=0;
        for(int i=0;i<n;i++){
            costbyUnitArea=costbyUnitArea+(plots[i]*costPerUnitArea[i]);
        }
        for(int i=0;i<n-1;i++){
            cost=cost+plots[i]+plots[i+1];
            plots[i+1]=plots[i]+plots[i+1];
        }
        System.out.println(cost);
        String rs=(cost<costbyUnitArea)? "YES":"NO";
        System.out.println(rs);
        //End code
        sc.close();
    }
}