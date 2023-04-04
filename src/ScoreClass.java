// learning to compare using == operator and equals() method
import java.util.Scanner;

public class ScoreClass {

    public static void compareScore() {
        Scanner scan = new Scanner(System.in);

        String score_1, score_2;

        System.out.println("Enter score 1:");
        score_1 = scan.nextLine();
        // score_1 = scan.nextInt();

        System.out.println("Enter score 2:");
        score_2 = scan.nextLine();
        // score_2 = scan.nextInt();  

        scan.close(); // close the scanner

        if (score_1 == score_2) {
            System.out.println("Score_1 and score_2 have the same reference");
        } 
        else {
            System.out.println("Score_1 and score_2 have different references");
        }

        if (score_1.equals(score_2)) {
            System.out.println("Score_1 and score_2 have the same content");
        } 
        else {
            System.out.println("Score_1 and score_2 have different content");
        }

    }
}
