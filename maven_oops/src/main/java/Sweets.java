
public class Sweets extends Choclates {
	int ada,baa,count=0,s=0,s1=0;
	Sweets(int ada,int baa)
	{
		super(ada,baa);
		
	}
	public int[] weight(int a[],int p[])
	{    int a1[]=new int[3];
	     
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>ada && a[i]<baa)
			{
				count++;
				
			}
			s=s+a[i]*p[i];
			s1=s1+a[i];
			
		}
		a1[0]=count;
		a1[1]=s;
		a1[2]=s1;
		return a1;
	}

}
