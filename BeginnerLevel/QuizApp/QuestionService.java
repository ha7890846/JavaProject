import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1,new int[]{1,2,3,4},4,"What is the int size");
        questions[1] = new Question(2,new int[]{10,20,7,40},7,"What is the sum of:2+5 = ?");
        questions[2] = new Question(3,new int[]{100,200,300,400},200,"What is the value of 2*100:");
        questions[3] = new Question(4,new int[]{11,22,2,444},2,"What is x = 22-20:");
        questions[4] = new Question(4,new int[]{12,76,32,42},76,"What is x =23+53");
    }
    public void displayQuestion(){
        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i].getId()+". "+questions[i].getQuestion());
            int[] option = questions[i].getOption();
            for(int v: option){
                System.out.println(v);
            }
        }
    }
    public void playQuiz(){
        Scanner sc = new Scanner(System.in);

        int score = 0;
        for(int i=0;i<questions.length;i++){
            System.out.println("Question "+(i+1)+": "+questions[i].getQuestion());
            int[] option = questions[i].getOption();
                for(int v: option){
                System.out.println(v);
                }
                System.out.print("Enter Your answer: ");
                int selectedOption  = sc.nextInt();
                if(selectedOption == questions[i].getAns()){
                    System.out.println("correct Answer");
                    score++;
                }else{
                    System.out.println("wrong Answer.");
                }
        }
        System.out.println("---------------------------------------------");
        System.out.println("Your Score is: " + score);
    }
}
