
package Dev_J110;


public class IntegralCalculator {
        
    public static double calculator(MyFunction function, double from, double to, int quantity) {
        
        double lenghtInterval = Math.abs((to - from)/quantity);
        double argumentCurrent = (from + lenghtInterval)/2;
        double integral = 0;
        
        for(int i =0; i < quantity; i++) {
        double currentIntegral = function.getValue(argumentCurrent)*lenghtInterval;
        integral += currentIntegral;
        argumentCurrent += lenghtInterval;
        }
        return integral;
    }
    
}
