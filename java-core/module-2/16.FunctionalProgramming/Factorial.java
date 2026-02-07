@FunctionalInterface
interface FactorialInterface {
    int findFactorial(int n);
}
class AbsBody implements FactorialInterface {
    @Override
    public int findFactorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
public class Factorial {
    public static void main(String[] args) {
        AbsBody ref = new AbsBody();
        System.out.println("Abstract class :"+ref.findFactorial(5));

        //Anonymous class
        FactorialInterface ref2 = new FactorialInterface() {
            @Override
            public int findFactorial(int n) {
                int fact = 1;
                for(int i = 1; i <= n; i++) {
                    fact *= i;
                }
                return fact;
            }
        };
        System.out.println("Anonymous class :"+ref2.findFactorial(5));

        //Lambda expression
        FactorialInterface ref3 = (n) -> {
            int fact = 1;
            for(int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        };
        System.out.println("Lambda expression :"+ref3.findFactorial(5));
    }
}
