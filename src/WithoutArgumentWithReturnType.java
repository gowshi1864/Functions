public class WithoutArgumentWithReturnType
{
    public static int add()
    {
        int a=10,b=20;
        int c=a+b;
        return c;
    }

    public static void main(String[] args)
    {
        WithoutArgumentWithReturnType f=new WithoutArgumentWithReturnType();
        System.out.print(f.add());

    }
}
