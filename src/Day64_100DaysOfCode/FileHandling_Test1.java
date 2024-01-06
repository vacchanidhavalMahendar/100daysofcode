package Day64_100DaysOfCode;
//2nd Jan Live Class File operation in Java (IO)


class Student{

    private Integer sid;
    private String sname;
    private Integer sage;

Student(Integer sid,String sname,Integer sage){

this.sage=sage;
this.sid=sid;
this.sname=sname;
}

public String toString(){
    return "sid: "+sid +"sname"+sname+"sage:"+sage;
}
}

public class FileHandling_Test1 {
    public static void main(String[] args) {


    Student s1= new Student(10,"sachin",50);
        System.out.println(s1);

        Student s2= new Student(30,"YUvi",60);
        System.out.println(s2);

    }
}
