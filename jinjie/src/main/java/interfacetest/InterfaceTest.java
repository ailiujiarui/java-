package interfacetest;

public class InterfaceTest {
    public static void main(String[] args){
      Student p = new Student();
      //p.number=0;
        System.out.println(Student.number);
    }
}

interface persons{
    public abstract void  cc();
     int number=0;
}

class Student extends person implements persons{
    int name;
    @Override
    public void cc(){
        System.out.println("cc");
    }
}
class person implements persons{


    @Override
    public void cc(){
        System.out.println("cc");
    }
}