import java.io.*;
class any
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
n=Integer.parseInt(br.readLine());
while(n!=42)
{

System.out.println(n);
n=Integer.parseInt(br.readLine());
}

}
}