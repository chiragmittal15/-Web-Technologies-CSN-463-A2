public class Main 
{

public static void main(String[] args) 
{
		int n = Integer.MAX_VALUE;
		for(int i=n;i>=1;i--)
		{
			int a;
			a=i*i;
			int b = (i*(i+1))/2;
			if(a==b)
			{
				System.out.println(i);
				break;
			}
		}
		
	}
}