//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int trout = scan.nextInt();
        int pike = scan.nextInt();
        int pickerel = scan.nextInt();
        int total = scan.nextInt();
        int maxtrout = total / trout;
        int maxpike = total / pike;
        int maxpickerel = total / pickerel;

        for (int i = 0; i <= maxtrout; i++) {
            for (int j = 0; j <= maxpike; j++) {
                for (int k = 0; k <= maxpickerel; k++) {
                    if (i + j + k > 0 && i * trout + j * pike + k * pickerel == total) {
                        System.out.println(i + " Brown Trout, " + j + " Northern Pike, " + k + " Yellow Pickerel");
                    }
                }
            }
        }



    }
}
