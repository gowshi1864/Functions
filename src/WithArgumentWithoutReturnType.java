public class WithArgumentWithoutReturnType
{
    public static void add(int x,int y)
    {
        System.out.println(x+y);
    }

    public static void main(String[] args)
    {
        //Method1:
        int x=20,y=30;
        add(x,y);

        //Method2:
        add(10,20);

        //Method3:
        WithArgumentWithoutReturnType f1=new WithArgumentWithoutReturnType();
        f1.add(10,10);
    }
}
