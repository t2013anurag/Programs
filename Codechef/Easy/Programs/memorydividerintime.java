import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class mem
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,k,c=0,t=0;
n=Integer.parseInt(br.readLine());
k=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
t=Integer.parseInt(br.readLine());
if(t%k==0)
c++;
}
System.out.println(c);
}
}