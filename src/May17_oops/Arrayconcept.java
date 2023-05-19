package May17_oops;

public class Arrayconcept {
    public String[] studentname;

    public static void main(String[] args)
    {
        Arrayconcept obj = new Arrayconcept();
        obj.Learn_array();
    }

    public void Learn_array() {
        studentname = new String[200];
        for (int a = 0; a < studentname.length; a++) {
            System.out.println(a);
            studentname[a] = "studentname_=" + a;
            System.out.println(studentname);
        }

        for (int i = 0; i < studentname.length; i++) {
            System.out.println("Strudent name is =>" + i);
        }
    }
}