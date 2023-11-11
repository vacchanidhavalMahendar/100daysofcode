package primitiveValueInjection;

public class Student {

    //instance Variables
    private String sname;
    private Integer sage;
    private Integer sid;


    //Constructor to set a value

    public Student(String sname,Integer sage,Integer sid){
        super();
        this.sname=sname;
        this.sage=sage;
        this.sid=sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString(){
        return "Student[sname=" sname+ ",   ]
    }
}
