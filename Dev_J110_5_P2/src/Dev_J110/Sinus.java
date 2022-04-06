
package Dev_J110;


public class Sinus implements MyFunction{

    @Override
    public double getValue(double argument) {
        
      return argument*Math.sin(argument);
    }
    
}
