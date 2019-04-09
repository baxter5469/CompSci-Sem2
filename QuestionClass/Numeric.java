public class Numeric extends Question {
    private int usrAnswer;
    public Numeric(String question,int answer){
        super(question);
        usrAnswer = answer;
    }
    public String getAnswer(){
        String usrInt = String.valueOf(usrAnswer);
        return usrInt;
    }
    public String checkAnswer(int usrIn){
        boolean checker = false;
        String correct = "Correct!";
        String incorrect = "Incorrect...";
        if (usrAnswer == usrIn){
            checker = true;
            super.correctCounter++;
            return correct;
        }
        else{
            checker = false;
            return incorrect + usrAnswer;
        }
    }
}