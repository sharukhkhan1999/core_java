import java.util.Scanner;
public class Binary
{
public static void main(String[] args)
{
int[] num=new int[10];
int i,j,dec;
Scanner sc=new Scanner(System.in);
System.out.println("enetr  your dec number");
dec=sc.nextInt();
i=0;
for(i=0;dec>0;i++)
{
num[i]=dec%16;
dec=dec/16;
}
System.out.println("binary number");
for(j=i-1;j>=0;j--)
{
//System.out.print("\t"+num[j]);
if(num[j]>=10)
{
System.out.print((char)(num[j]+55));
}
else
{
System.out.print(num[j]);
}
}


}
}