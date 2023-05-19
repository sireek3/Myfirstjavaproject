package May15;

public class Constructor_explain {
    public int roll=10;
    public Constructor_explain()
    {
roll=100;
        System.out.println("I am a constructor");
    }
    public static void main(String args[]) throws Exception {

        Constructor_explain obj = new Constructor_explain();
        System.out.println("Roll is "+obj.roll);
    }
    public int roll()
    {
        return 10;
    }
}
