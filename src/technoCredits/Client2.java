package technoCredits;

class Client2
{
    static int x =10;
    int y = 20;
    void m1()
    {
        int x = 100;
        int y = 200;
        int z = x + this.y;
         z = x + y;
        System.out.println("z is :" + z);    
    }
    static void m2()
    {
        int x = 200;
        int y =10;
        int z = x+y;
        System.out.println("z is " + z);
    }
    public static void main(String[] a)
    {
        Client2 c1 = new Client2();
        c1.m1(); // 120
        c1.m2(); // 210 
        System.out.println(x + c1.y); //220 //30
    }
}



