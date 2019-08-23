package technoCredits;
class Client4
{
    int y =20; //30
    void m1(int x) //4
    { //5
       int y = this.y+x; //30
       this.y = y;
       //int y =0;
       //y = y+x;
       //this.y = y + x; //6
    } //7

    void display() //9
    { //10
        System.out.println("Y is :" + y); //11
    } //12

    public static void main(String[] a)
    {
        Client4 c4 = new Client4(); //1
        int temp = 10; //2
        //int temp1 = 100; //2
        c4.m1(temp); //3
        c4.display(); //8
    } //13

}