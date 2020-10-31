import java.util.*;
class square
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[][];
        int m,n,i,j,temp=0;
        System.out.println("Enter array size");
        m=in.nextInt();
        n=in.nextInt();
        a=new int[m][n];
        System.out.println("Enter "+m*n+" values:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
         for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                temp=a[i][j];
                a[i][j]=a[m-1][j];
                a[m-1][j]=temp;
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        }
    }
