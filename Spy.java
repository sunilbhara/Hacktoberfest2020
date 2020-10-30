import java.util.*;
class Spy
{
    public int spy(int n)
    {
        int d=0,p=1,s=0;int c=0;
        for(int i=n;i>0;i=i/10)
        {
            d=i%10;
            s=s+d;
            p=p*d;
        }
        if(s==p)
        {
            c=1;
        }
        return(c);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=in.nextInt();
        Spy obj=new Spy();
        int p1=obj.spy(n);
        if(p1==1)
        System.out.println(n+" is a Spy no");
        else
        System.out.println(n+" is not a spy no");
    }
}
