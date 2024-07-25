import java.util.Arrays;

public class Question {
    private int id;
    private int Option[];
    private int ans;
    private String question;
    

    public Question(int id, int[] option, int ans, String question) {
        this.id = id;
        Option = option;
        this.ans = ans;
        this.question = question;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int[] getOption() {
        return Option;
    }
    public void setOption(int[] option) {
        Option = option;
    }
    public int getAns() {
        return ans;
    }
    public void setAns(int ans) {
        this.ans = ans;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    @Override
    public String toString() {
        return "Question [id=" + id + ", Option=" + Arrays.toString(Option) + ", ans=" + ans + ", question=" + question
                + "]";
    }

}
