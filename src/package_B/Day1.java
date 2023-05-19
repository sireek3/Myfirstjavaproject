package package_B;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Day1 {

    String city="michigan";
    public static void main(String args[]) throws Exception
    {//Data types
        String studentname="RAM";
        int studentroll=1;
        String address= "2333 kensington";
        float marks=9.5f;
        boolean graderesult=true;

        //creating an object of class
        Day1 obj=new Day1();
        obj.add_twonumbers();
        System.out.println("My first java program");
        System.out.println("the adress is "+address);
        System.out.println("city is "+obj.city);
        //creating object of May10basics
        May10basics obj1=new May10basics();
        System.out.println("school address is  "+obj1.schooladdress);
        obj1.rateofiterest();
    }

    //void method
    public void add_twonumbers(){
        int sum =5+5;
        System.out.println("sum is "+sum);

    }
    public String astringtypeprogram(){
        return "welcom to java";
    }
    public int integertypeprog(){
        return 30;
    }

}
