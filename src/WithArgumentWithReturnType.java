public class WithArgumentWithReturnType
{
    public static int add(int x,int y)
    {
        return x+y;
    }

    public static void main(String[] args)
    {
        WithArgumentWithReturnType f1=new WithArgumentWithReturnType();
        int x=10,y=20;
        int ans=f1.add(x,y);
        System.out.println(ans);
    }
}
