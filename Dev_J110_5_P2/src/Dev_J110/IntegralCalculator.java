
package Dev_J110;

import java.util.function.Function;

//Это класс, который умеет вычислять определенный интеграл
public class IntegralCalculator {
        
    public static double calculator(Function<Double, Double> f, double xS, double xF, int segments) {
        
        if(segments > 0) {
        double integral = 0;
        double segmentLength = (xF - xS)/segments;
        double deltaX = segmentLength / 2;
        double currentX = xS;
        
        for(int i =0; i < segments; i++) {
            integral += f.apply(currentX + deltaX)*segmentLength;
            currentX += 2*deltaX;
        }
            return integral; }
        else 
            throw new IllegalArgumentException("Количество отрезков задано некорректно.");
    }
    
}
