package technoCredits;

class Client1
{
    int x =10;
    static int y = 20;
    String msg = "Hi";
     void m1()
    {
        x = x+20;// 30
        y = y+20; // 40
        System.out.println("x+y is " + (x+y)); // error
    }
     void m2()
    {
        System.out.println(msg + ": "+x + ":" + y); //Hi 30 40; Hi 30 20; Hi 10 40 ; Hi 10 20
    }
    public static void main(String a[])
    {
        Client1.y = 100;
        Client1 c1 = new Client1();
        
        c1.m1(); // 150 ; 
        Client1 c2 = new Client1();
        c2.m2(); // Hi 10 120 ; hi 10 100; hi 10 20; 
    }


}







