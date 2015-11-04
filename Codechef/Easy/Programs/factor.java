import java.io.*;
class factor
{
static int fact(int a)
{
int f=1;
if(a==0)
return 1;
for(int i=1;i<=a;i++)
{
f=f*i;
}
return f;
}

public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int [] t=new int[n];
int k=0;
for(int i=0;i<n;i++)
{
t[i]=Integer.parseInt(br.readLine());
k=fact(t[i]);
System.out.println(k);
}
}
}