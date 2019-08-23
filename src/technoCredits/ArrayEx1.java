package technoCredits;

class ArrayEx1
{
    static void m1()
    {
        String[] name = {"Maulik","harsh","Anup","Amita"};
        System.out.println(name);
        System.out.println("Array length is " + name.length);
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }
        
    }
    public static void main(String[] a)
    {
        m1();
    }   
}