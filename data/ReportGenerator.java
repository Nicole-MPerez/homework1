import javax.print.DocFlavor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class ReportGenerator {
    public static void main() throws FileNotFoundException {
         Scanner in=new Scanner(new File("PUTINGDATA.CSVFILE!"));
         in.useDelimiter(",");
        PrintStream output= new PrintStream("report.txt");
          //initialize the sum to 0
        double sum=0;
        String date = in.nextDouble();
        String start =date;
        String SKU_number = in.nextDouble();
        double price = in.nextDouble();
        double Discount_percentage = in.nextDouble();
        double max = price;
        String maxSKU = SKU;
        double min = price;
        String minSKU =SKU;
        while (in.hasNext()){
            //calculate the discount price
            pirce=price*(discount_percentage/100);
            //display the item with the maximum price
            if (price>max){
                max=price;
                maxSKU=SKU;

            }

            //display the item with the minimum price
            if (price == min){
               price=min;
               minSKU=SKU;
            }
            //reread the variable
            date = in.nextDouble();
            SKU = in.nextDouble();
            price = in.nextDouble();
            discount_precentage = in.nextDouble();
        }
            // calculate the tax
        double tax = (sum*0.08875);
        String end = date;
        output.println("Report from" + start + " to " + end + " ");
        output.println("The total is %.2f/n", sum);
        output.println("the tax is %.2f/n" , tax);
        output.println("The highest price item is %s at %.0f/n", maxSKU, max);
        output.println("The lowest price item is %s at %.0f/n", minSKU, min);

        output.close();


    }
}
