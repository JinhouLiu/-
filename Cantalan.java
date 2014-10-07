public  class     Cantalan
{
//求卡特兰数代码
public  static void   main(String[]   args)
{
System.out.print(catalan(3));	
}
public static int catalan(int  n)  
{
int result=0;	
int[] h=new int[n+1];
h[0]=h[1]=1;
for(int i=2;i<=n;i++)
{
h[i]=0;
for(int j=0;j<i;j++)
{
h[i]+=(h[j]*h[i-1-j]);		
}		
}
result=h[n];
return  result;
}
public static void main(String[]  args)
{

}
}
//小米面试题一道：N对括号所有的合法状态,即卡特兰数的应用,深度优先，也可以简单使用卡特兰数的特点直接求出
public  class  Solution
{
public  final static int PAIR=50; 
private  static char[] strs=new char[PAIR*2+1];  
public static void DFS_bracket(int n,int leftUsed,int rightUsed)
{	
if((leftUsed==rightUsed)&&(leftUsed+rightUsed==2*n))
{
System.out.println(new String(strs)); 
return;
}
if((leftUsed<rightUsed)||(leftUsed+rightUsed>=2*n))
{
return;		
}
int index=leftUsed+rightUsed;
strs[index]='(';
DFS_bracket(n,leftUsed+1,rightUsed);
strs[index]=')';
DFS_bracket(n,leftUsed,rightUsed+1);
}     		
public static void main(String[] args)
{
DFS_bracket(3, 0, 0);	
}  
}

