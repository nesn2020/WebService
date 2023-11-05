package example;

import mypackage.TaxCalculatorImpl;
import mypackage.TaxCalculatorImplServiceLocator;

public class TaxClient {
  public static void main(String[] argv) {
      try {
          TaxCalculatorImpl taxCalculator = new TaxCalculatorImplServiceLocator().getTaxCalculatorImplPort();
          double income = 8000;
          double tax = taxCalculator.calculateTax(income);
          System.out.println("收入为 " + income + " 元所需要交的税为 " + tax + "元");
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}
