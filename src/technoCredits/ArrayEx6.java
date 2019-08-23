package technoCredits;

class ArrayEx6
{
    static void m1()
    {
        int[] num1 = {100,200,300};
        int[] num2 = {100,200,400};
        int i;
        for(i=0;i<num1.length;i++)
        {
            if(num1[i] != num2[i])
            {
                System.out.println("Arrays are not equal");
                break;
            }
        }
        if(i==num1.length)
            System.out.println("Arrays are equal");

    }

    public static void main(String[] a)
    {
        m1();
    }
}