package May17_oops;

public class Iphone15child extends Iphone14parent
{

    public static void main(String args[])
    {
        //Iphone14parent obj14=new Iphone14parent();
        Iphone15child obj15=new Iphone15child();
        obj15.call_using_phone();

    }
    public void Security_by_Fingerprint()
        {
            System.out.println("we can unlock by fingertouch");

    }
    public void HD_Picture()
    {
        System.out.println("we can capture HD picture");
    }
    public void lock_by_doubleshake()
    {
        System.out.println("we can lock by Double shake");
    }
}
