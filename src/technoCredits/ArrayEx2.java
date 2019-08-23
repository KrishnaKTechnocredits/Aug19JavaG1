package technoCredits;

class ArrayEx2
{
    static void m1()
    {
        String[] name = {"Maulik","harsh","Anup","Amita","Komal"};
        System.out.println(name);
        System.out.println("Array length is " + name.length);
        for(int i=name.length-1;i>=0;i--)
        {
            System.out.println(i); // 3 2 1 0 
        }
        
    }
    public static void main(String[] a)
    {
        m1();
    }   
}