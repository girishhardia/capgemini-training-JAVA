// method shadowing

class Father {
    public static void test(){
        System.out.println("Father class test method");
    }
    public static void demo(int a){
        System.out.println("Father class demo method");
    }
}

class Son extends Father {
    public static void test(){
        System.out.println("Son class test method");
    }
    public static void demo(int a){
        System.out.println("Son class demo method");
    }
}

public class MethodShadowing {
    public static void main(String[] args) {
        System.out.println("Main start");
        System.out.println("--Father object stored in Father ref variable--");
        Father ref1 = new Father();
        ref1.test();
        ref1.demo(0);
        System.out.println("--Son object stored in Son ref variable--");
        Son ref2 = new Son();
        ref2.test();
        ref2.demo(0);
        System.out.println("---Upcasting---");
        Father ref3 = new Son();
        ref3.test();
        ref3.demo(0);
        System.out.println("---Downcasting---");
        Son ref4 = (Son) ref3;
        ref4.test();
        ref4.demo(0);
        System.out.println("Main end");
    }
}




