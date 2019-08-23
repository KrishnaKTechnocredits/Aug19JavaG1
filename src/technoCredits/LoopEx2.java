package technoCredits;

class LoopEx2
{
    void display(String name)
    {
        int i;
        for(i=5;i>=1;i--)
            System.out.println(name + ":" + i);
        System.out.println("i value at the time of loop exit :" + i);
    }
    public static void main(String[] a)
    {
        LoopEx2 loopEx2 = new LoopEx2();
        loopEx2.display("Maulik");
        loopEx2.display("Prateet");
    }
}