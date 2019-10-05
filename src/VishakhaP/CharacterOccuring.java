package VishakhaP;

public class CharacterOccuring {
    public static void main(String[] args)
    {
        String str = "hello how are you harsh";
        char ch = 'h';
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) 
        {
            if(ch == str.charAt(i))
            {
                frequency++;
            }
        }

        System.out.println(" Char is :h and No of occurrence : " + frequency);

    }

}