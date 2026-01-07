// candy crush level acces through upcasting

public class CandyCrushUpcasting {
    public static void main(String[] args) {
        Level1 ref = new Level3(); // upcasting
        ref.start();
        ref.level1Completed();
        Level2 ref2 = (Level2) ref; // downcasting
        ref2.start();
        ref2.level2Completed();
        Level3 ref3 = (Level3) ref; // downcasting
        ref3.start();
        ref3.level3Completed();
    }
}

class Level1 {
    public void start() {
        System.out.println("Candy Crush level 1");
    }
    public void level1Completed() {
        System.out.println("Level 1 completed");
        
    }
}

class Level2 extends Level1 {
    public void start() {
        System.out.println("Candy Crush level 2");
    }
    public void level2Completed() {
        System.out.println("Level 2 completed");
    }
}

class Level3 extends Level2 {
    public void start() {
        System.out.println("Candy Crush level 3");
    }
    public void level3Completed() {
        System.out.println("Level 3 completed");
    }
}