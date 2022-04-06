package Dev_J110;

public class Main {

    
    public static void main(String[] args) {
        
        MyFunction log = new LogNaturel();
        MyFunction squareXPlus = new SquareXPlus();
        MyFunction exponenta = new Exponenta();
        MyFunction squareX = new SquareX();
        MyFunction sinus = new Sinus();
        
        double integralLOg = IntegralCalculator.calculator(log, 2, 5, 100);
        double integralsquareXPlus = IntegralCalculator.calculator(squareXPlus, 3, 4, 100);
        double integralexponenta = IntegralCalculator.calculator(exponenta, 0.01, 2, 100);
        double integralsquareX = IntegralCalculator.calculator(squareX, 1, 3, 100);
        double integralsinus = IntegralCalculator.calculator(sinus, 1, 3, 100);
        
        
        
        System.out.println("integralLOg = " + integralLOg + "\nintegralsquareXPlus = " + integralsquareXPlus + 
                           "\nintegralexponenta = " + integralexponenta + "\nintegralsquareX = " + integralsquareX + 
                           "\nintegralsinus = " + integralsinus);
        
     

    }
    
}
