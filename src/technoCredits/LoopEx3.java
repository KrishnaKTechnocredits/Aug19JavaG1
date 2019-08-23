package technoCredits;

class LoopEx3
{
    void display(String name, int start, int end)
    {
        for(int i=start;i<=end;i++)
        {
            System.out.println(name + ":" + i);
        }
    }
    
    public static void main(String[] a)
    {
        LoopEx3 loopEx3 = new LoopEx3();
        loopEx3.display("Maulik",20,30);
    }
}