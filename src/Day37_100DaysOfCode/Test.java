package Day37_100DaysOfCode;

class Test
{
    public void methodOne(int ...i){System.out.println("Var arg method");}
    public void methodOne(int i){System.out.println("Int arg method");}

    public static void main(String[] args)
    {
        Test t= new Test();
        t.methodOne(10);//Int arg method
        t.methodOne();//Var arg method
        t.methodOne(10,20,30);//Int arg method
    }
}









    }
}
