package technoCredits;

class Client7
{
    int m1(int x, int y) //3
    { //4
        int temp = x+y; //5 :: 30
        return x+y; // 6 :: 30
    } //7
    int m2(String msg, int x) // 10 :: Maulik , 30
    { //11
        System.out.println("in m2"); //12
        return x; //13 ::30
    } //14
    String m3(int y, int x) // 17 30::30
    {
        System.out.println("in m2"); //18
        return "technocredits"; //19
    } //20
    public static void main(String[] a)
    {
        Client7 client7 = new Client7(); //1
        int ans = client7.m1(10,20); //2 //8 ::30
        int ans1 = client7.m2("Maulik",ans); //9 :: 30 //15
        String fAns = client7.m3(ans,ans1); // 16  //21 ::C technocredits
        System.out.println(fAns); // technocredits
    }
}