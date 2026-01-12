abstract class Father{

    abstract public void abs();
    static{
        System.out.println("Static initializer block");
    }
    {
        System.out.println("Instance initializer block");
    }
    Father(){
        @Override
        public void abs(){
            System.out.println("Father constructor");
        }
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        System.out.println("Main start");
        //Father ref = new Father(); CTE cannot instantiate the type Father
        Father ref = new Son();
        ref.test();
        ref.demo(0, 0);
        //Downcasting
        Son ref2 = (Son) ref;
        ref2.show();
        System.out.println("Main end");
    }
}
