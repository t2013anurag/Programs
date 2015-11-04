import java.io.*;
class holess
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
int hole;
for(int i=0;i<t;i++)
{
String a=br.readLine();
a=a+' ';
int length=a.length();
hole=0;
for(int j=0;j<length;j++)
{
char chr=a.charAt(j);
if(chr =='A' || chr =='D' || chr =='O' || chr =='P' || chr =='Q' || chr =='R')
hole++;
else if(chr =='B')
hole=hole+2;
}
System.out.println(hole);
}
}
}