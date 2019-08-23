package technoCredits;

class Client5
{
    int m1(int x) //3
    { //4
        x = x*10; //5
        return x;
    }

    public static void main(String[] a)
    {
        Client5 client5 = new Client5();//1
        int ans = client5.m1(10); //2
        System.out.println(ans);
    }
}