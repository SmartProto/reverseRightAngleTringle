import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        byte numOfRows;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the Number of rows you want to display");
        numOfRows = cin.nextByte();

        for(byte i = 1; i <= numOfRows; i++){
            for(byte j = 1; j <= numOfRows - i; j++)
                System.out.print(" ");
            
            for(int k = 1; k <= (2 * i) - 1; k++)
                System.out.print("*");    
            System.out.println();
        }
        cin.close();
    }
}
