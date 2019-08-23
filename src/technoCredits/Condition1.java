package technoCredits;

class Condition1
{
    void m1(int x)
    {
        if(x>=90 && x<=100)  {           
            System.out.println("A+");
            System.out.println("Hi"); 
        }
        else if(x>=80 && x<90)
            System.out.println("A");
        else if(x>=70 && x<80)
            System.out.println("B+");
        else
            System.out.println("fail");    
    }
    
}