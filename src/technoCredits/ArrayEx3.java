package technoCredits;

class ArrayEx3
{
    void arrayElementSum()
    {
        int sum=0;
        int[] num = {100,2,3,4,5};
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
            sum = sum + num[i];
        }
    }

}