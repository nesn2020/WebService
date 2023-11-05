package example;
import javax.jws.WebService;

@WebService
public class TaxCalculatorImpl implements TaxInterface {
    @Override
    public double calculateTax(double income) {
        double rate = 0;
        double tax = 0.0;
        if(income >= 5000 && income < 7000){
            rate = 0.05;
        }else if(income >= 7000 && income < 10000){
            rate = 0.08;
        }else if(income >= 10000){
            rate = 0.1;
        }
        tax = income * rate;
        return tax;
    }
}