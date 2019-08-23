package technoCredits;

class ArrayEx5
{
    static void m1()
    {
        int[] num1 = {100,200,300};
        int[] num2 = {100,200,300};
        boolean flag=true;
        for(int i=0;i<num1.length;i++)
        {
            if(num1[i] != num2[i])
            {
                flag=false;
                System.out.println("Arrays are not equal");
            }
        }
        if(flag==true)
            System.out.println("Arrays are equal");

    }

    public static void main(String[] a)
    {
        m1();
    }
}