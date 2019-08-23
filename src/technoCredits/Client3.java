package technoCredits;

class Client3
{
    int x =10;
    int y=20;

     void m1()
    {
        int x=100;
        int y=200;
        System.out.println(x+y); // first pref will be given to local variable, if not found then it will look for instance variable
        System.out.println(this.x+y); // this keyword can be used within non static method
        System.out.println(this.x+this.y);
        this.x = this.x + 10;
        // Non static members can't be accessed using class name.
        // System.out.println(Client3.x+Client3.y); // compilation error
        Client3 client3 = new Client3();
        System.out.println(client3.x+client3.y); // ?? 40 30 
        client3.x = 1000;
        System.out.println(this.x); //20
    }

    public static void main(String[] a)
    {
        Client3 client3 = new Client3();
        client3.m1();
    }
}