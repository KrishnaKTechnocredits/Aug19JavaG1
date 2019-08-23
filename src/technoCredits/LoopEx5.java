package technoCredits;

class LoopEx5
{
    int m1(int start, int end)
    {
        int evenSum=0;
        int oddSum=0;
        for(int i=start;i<=end;i++)
        {
            if(i%2 == 0)
            {
                evenSum = evenSum + i;
            }else
            {
               oddSum = oddSum + i;
            }
        }
        System.out.println("odd sum " + oddSum);
        System.out.println("even sum " +evenSum);
        //int total = oddSum + evenSum;
        return oddSum + evenSum;
    }

    public static void main(String[] a)
    {
        int total = new LoopEx5().m1(20,50);
        System.out.println(total);
    }


}