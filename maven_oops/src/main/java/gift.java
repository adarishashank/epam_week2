
import java.util.*;
public class gift {
     public static void main(String args[])
     {
    	 Scanner sha=new Scanner(System.in);
    	 
    	 System.out.println("Enter the number of gift choclates and the respective prizes u want from the list");
    	 int n=sha.nextInt();
    	 int y=n;
    	 System.out.println("Enter the range of the candies weight in Gift");
    	 int x=sha.nextInt();
    	 int y1=sha.nextInt();
    	 
    	 Choclates s=new Choclates(x,y1);
    	 int a[]=new int[y];
    	 int b[]=new int[y];
    	 int i=0;
    	 System.out.println("enter the choclate weight and prize");
    	 while(n!=0)
    	 {
    		 a[i]=sha.nextInt();
    		 b[i]=sha.nextInt();
    		 i++;
    		 
    		 
    		 n=n-1;
    	 }
    	 int a2[]=new int[3];
    	 a2=s.weight(a, b);
    	
    	 
    	 
    	 System.out.println("Enter the number of gift sweets and the respective prizes u want");
    	 int konda=sha.nextInt();
    	 int k2=konda;
    	
    	 
    	 Sweets e=new Sweets(x,y1);
    	 int ba[]=new int[k2];
    	 int bb1[]=new int[k2];
    	 int i1=0;
    	 System.out.println("enter the sweets weight and prize");
    	 while(konda!=0)
    	 {
    		 ba[i1]=sha.nextInt();
    		 bb1[i1]=sha.nextInt();
    		 i1++;
    		 
    		 
    		 konda=konda-1;
    	 }
    	 int ba2[]=new int[3];
    	 ba2=e.weight(ba, bb1);
    	
    	 for(int d=0;d<3;d++)
    	 {
    		 
    		 a2[d]=a2[d]+ba2[d];
    		 
    	 }
    	 System.out.println("the count of candies in the box "+a2[0]);
    	 System.out.println("the total price of the box is "+a2[1]);
    	 System.out.println("the total weight of the box is "+a2[2]);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
