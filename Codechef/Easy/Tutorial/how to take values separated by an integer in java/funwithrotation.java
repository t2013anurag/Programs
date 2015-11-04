import java.io.*;
class rotate
{
    public static void main(String []args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String []inp;
        int m,n,i,d;
        char ch;
        inp=br.readLine().trim().split(" ");
        n=Integer.parseInt(inp[0]);
        m=Integer.parseInt(inp[1]);
        int arr[]=new int[n];
        inp=br.readLine().trim().split(" ");
        for(i=0;i<n;i++)
        arr[i]=Integer.parseInt(inp[i]);
         i=0;
         
		 while(m>0)
			{
				inp=br.readLine().trim().split(" ");
				ch=inp[0].charAt(0);
				d=Integer.parseInt(inp[1]);
				if(ch=='R')
					System.out.println(arr[(i+d-1)%n]);
				else if(ch=='C')
					i=(i+d)%n;
				else if(ch=='A')
					{
						i=i-d;
						if(i<0)
							i+=n;
					}
				m--;
			}
    }
}