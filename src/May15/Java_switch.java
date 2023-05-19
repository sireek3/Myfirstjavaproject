package May15;

public class Java_switch {
    public static void main(String args[]) throws Exception
    {
Java_switch obj=new Java_switch();
       // int num;
        obj.print_day( 5);
    }
    public void print_day(int data)
        {
        String daystring=null;
        switch(data)
        {
            case 1:daystring="sunday";
            break;
            case 2:daystring="Monday";
                break;
            case 3:daystring="Tuesday";
                break;
            case 4:daystring="Wednesday";
                break;
            case 5:daystring="Thursday";
                break;
            case 6:daystring="Friday";
                break;
            case 7:daystring="saturday";
                break;
            default:
                daystring="invalid_day";
                break;

        }
            System.out.println("Day is "+daystring);
    }
}
