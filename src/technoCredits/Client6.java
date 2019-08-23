package technoCredits;
class Client6
{
    int y =30;
    int m1(int x) //3 // //6
    { //4 //7
        x = x*10; //5 //8 
        return x; //9
    }  //10
    int m2() //3
    { //4
    
        int anwer = m1(y); //5
        System.out.println(anwer);
        return anwer;
    }

    public static void main(String[] a)
    {
        Client6 client6 = new Client6();//1
        int ans = client6.m2(); //2
        System.out.println(ans);
    }
}