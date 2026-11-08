package calculatortest;

public class CalculatorTest {


    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        // + Operater
        System.out.println(a + b);
        
        // - Operater
        System.out.println(a - b);
        
        // * Operater
        System.out.println(a * b);
        
        // / Operater
        System.out.println(a / b);
        
        // % Operater (Module Operater)
        System.out.println(a % b);
        
        //double casting
        double devision = (double) a / b;
        System.out.println(devision);
        
        //Comparison logical expression
        boolean comparison1 = a > b;
        System.out.println(comparison1);
        
        boolean comparison2 = a < b;
        System.out.println(comparison2);
        
        boolean comparison3 = a == b;
        System.out.println(comparison3);
        
        boolean comparison4 = a != b;
        System.out.println(comparison4);
        
        
    }
    
}
