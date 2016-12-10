import java.util.Scanner;
import java.util.Arrays;

public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);

System.out.println("Enter coloumn/row size of first/second matrix: ");
int cr = input.nextInt();

System.out.println("Enter row size of First matrix: ");
int row = input.nextInt();

System.out.println("Enter coloumn size of Second matrix: ");
int col = input.nextInt();

int [][]A = new int[row][cr];
int [][]B = new int[cr][col];
int [][]C = new int[row][col];


System.out.print("Enter the element of first matrix: ");
for(int i=0;i<row;i++)
{
for(int j=0;j<cr;j++)
{
A[i][j] = input.nextInt();
}
}

for(int []arr:A){
System.out.println(Arrays.toString(arr));
}

System.out.print("Enter the element of Second matrix: ");
for(int i=0;i<cr;i++)
{ 
for(int j=0;j<col;j++)
{ 
B[i][j] = input.nextInt();
}
}

for(int []a:B)
{
System.out.println(Arrays.toString(a));
}


for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
C[i][j]=0;

for(int k=0;k<cr;k++)
{
C[i][j] = C[i][j]+A[i][k]*B[k][j];
}

}
}

System.out.println("Matrix Multiplication result..........");
for(int []a:C)
{
System.out.println(Arrays.toString(a));
}

}
}
