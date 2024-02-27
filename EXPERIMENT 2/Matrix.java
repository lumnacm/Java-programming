import java.util.Scanner;
public class Matrix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows");
int m=sc.nextInt();
System.out.println("Enter the number of column");
int n=sc.nextInt();
int[][]mat1=new int[m][n];
int[][]mat2=new int[m][n];
int[][]sumMat=new int[m][n];
System.out.println("Enter the first matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
mat1[i][j]=sc.nextInt();
}
}
System.out.println("Enter the secondmatrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
mat2[i][j]=sc.nextInt();
}
}
System.out.println("Sum matrix is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
sumMat[i][j]=mat1[i][j]+mat2[i][j];
System.out.print(sumMat[i][j]+"\t");
}
System.out.println();
}
}
}
