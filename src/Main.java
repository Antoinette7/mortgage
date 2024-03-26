import java.text.NumberFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
      Scanner scanner = new Scanner(System.in);

      System.out.print("principal: ");
      int principle = scanner.nextInt();

      System.out.print("Annual Interest Rate: ");
      float annualInterest = scanner.nextFloat();

      float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
      System.out.print("period (years): ");
      byte years = scanner.nextByte();
      int numberOfpayment = years * MONTHS_IN_YEAR;

      Double Morgage = principle
              *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfpayment))
              /(Math.pow(1+monthlyInterest, numberOfpayment) -1);
      String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Morgage);
              System.out.println("Morgage: " +mortgageFormatted);
        }

    }
