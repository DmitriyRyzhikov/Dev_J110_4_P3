package Dev_J110;

import java.util.function.Function;

public class Main {
    
    public static void main(String[] args) {
        
        /*Вызов метода вычисления интеграла с использованием реализации функционального интерфейса 
         Function через вложенный класс LogNatural. */
        double log = IntegralCalculator.calculator(new LogNatural(), 2, 5, 100);
        
        /*Вызов метода вычисления интеграла с использованием реализации функционального интерфейса 
        Function через анонимный внутренний класс. */
        double x2plus = IntegralCalculator.calculator(new Function<Double, Double>() {
            @Override
            public Double apply(Double argument) {
                   return Math.pow(argument, 2) + argument;
            }
        }, 3, 4, 100);
        
        /*Вызов метода вычисления интеграла с использованием реализации функционального интерфейса
         Function через ссылку на метод экземпляра.*/
        Exponenta e = new Exponenta();
        double exp = IntegralCalculator.calculator(e::getValue, 0.01, 2, 100);
        
        /*Вызов метода вычисления интеграла с использованием реализации функционального интерфейса 
         Function через ссылку на статический метод.*/
        double x2 = IntegralCalculator.calculator(SquareX::getValue, 1, 3, 100);
        
        /*Вызов метода вычисления интеграла с использованием реализации функционального интерфейса 
         Function через лямбда-выражение. */
        double sin = IntegralCalculator.calculator(argument -> argument*Math.sin(argument), 1, 3, 100); 
       
        //вывод результатов в консоль
        System.out.println("\u222Bln(x) = " + log);
        System.out.println("\u222Bx\u00B2+x = " + x2plus);
        System.out.println("\u222Be^(-x) = " + exp);
        System.out.println("\u222Bx\u00B2 = " + x2);
        System.out.println("\u222Bx*Sin(x) = " + sin);
    }
    
    //вложенный класс LogNatural.
    private static class LogNatural implements Function<Double, Double> {

        @Override
        public Double apply(Double argument) {
            return Math.log(argument);
        }  
  }
}