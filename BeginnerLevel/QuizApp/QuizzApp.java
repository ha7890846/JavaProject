import java.util.Scanner;

public class QuizzApp {
    public static void main(String[] args) {
        QuestionService obj = new QuestionService();
        System.out.println("What you want in quizz:\n1. Play Quizz"+
            "\n2.Show Question");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                obj.playQuiz();
                    break;
            default:
                obj.displayQuestion();
                break;
        }
    }
}
