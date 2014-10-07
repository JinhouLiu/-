public class Solution
{
//使用O(1)空间实现数组转置
public static int getPre(int  index,int  m,int  n)
{
return (index%m)*n+(index/m);          	
}  
public static int getNext(int  index,int m,int n)
{
return (index%n)*m+(index/n); 	
}
public static void move(int[] matrix,int  i,int  m,int n)
{
int curVal=matrix[i];
int cur=i;
int pre=getPre(i, m, n);
while(i!=pre){
 matrix[cur]=matrix[pre];	
cur=pre;
pre=getPre(cur, m, n);
}
matrix[cur]=curVal;
} 
public static void matrixTranspose(int[] matrix,int   m,int  n)
{	
for (int i = 0; i < m*n;i++)
{
int   next=getNext(i, m, n);
while(i<next)
{
next=getNext(next, m, n);	
}
if (next==i)
{
move(matrix, i, m, n);		
}
}	
}          	
public static void main(String[]  args)
{
int[] matrix={0,1,2,3,4,5,6,7,8,9};
for(int i = 0; i < matrix.length;i++)
{
System.out.print(matrix[i]+"\t");
}
matrixTranspose(matrix,2,5);
System.out.println();
for (int i = 0; i < matrix.length; i++)
{
System.out.print(matrix[i]+"\t");	
}
}   
}
