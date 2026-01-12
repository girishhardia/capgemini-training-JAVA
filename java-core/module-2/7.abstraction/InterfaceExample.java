interface Father {
    abstract public void test();
    abstract public void demo(int a, int b);
}

class Son implements Father {
    @Override
    public void test(){
        System.out.println("Son class test method");
    }
    @Override
    public void demo(int a, int b){
        System.out.println("Son class demo method");
    }
    public void show(){
        System.out.println("Son class show method");
    }
}

public class InterfaceExample {
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
