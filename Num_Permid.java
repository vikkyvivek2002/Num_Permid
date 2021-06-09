class Num_Permid
{
public static void main(String[] args)
{
for(int i=1;i<=5;i++)
{
  for(int j = 5; j>i;j--)
{
  System.out.print(" ");
}
    for(int n=1;n<=i;n++)
{
      System.out.print(n+" "); 
}
          System.out.println();
}
}
} 