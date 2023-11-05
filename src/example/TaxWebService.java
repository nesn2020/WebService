package example;


import javax.xml.ws.Endpoint;

public class TaxWebService {
    public static void main(String[] argv) {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        String address = "http://localhost:9000/TaxCalculator";
        Endpoint.publish(address, taxCalculator);
    }
}
