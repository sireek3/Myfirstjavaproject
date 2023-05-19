package May_12;

import javax.swing.*;

public class Javacontrolstmt
{
    public static void main(String args[])throws Exception
    {
        Javacontrolstmt obj =new Javacontrolstmt();
        obj.rateofhomeloaninterest("boa");
        obj.print_1_to_100();
            obj.learn_whileloop();

    }
    public void rateofhomeloaninterest(String bankname)
    {
        if(bankname.equalsIgnoreCase("jpmc"))
        {
            System.out.println("Home loan interest is"+7.8);
        }
        if(bankname.equalsIgnoreCase("wellsfargo"))
        {
            System.out.println("Home loan interest is"+9.8);
        }
        if(bankname.equalsIgnoreCase("boa"))
        System.out.println("Home loan interest is"+6.8);
    }

    public void eligibleforhilltrekking(int age)
    {
        if(age<18 || age>60)
            System.out.println("you are not eligible for the trip"+age);
        else if(age>=18 && age<60)
            System.out.println("eligible for trekking");
        else System.out.println("you are giving wrong input");
    }
    public void print_1_to_100()
    {
        for(int a=1;a<=10;a++)
        System.out.println("current value of a is " +a);
    }
    public void learn_whileloop()
        {
            int i=0,n=20;
            while( i<=n)
            {
                System.out.println("The value of i is "+i);
                i++;
            }

}
}
