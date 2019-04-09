public class TrueFalse extends Question {
    private boolean usrAnswer;
    public TrueFalse(String question,boolean answer){
        super(question);
        usrAnswer = answer;
    }
    public String getAnswer(){
        String usrStr = Boolean.toString(usrAnswer);
        return usrStr;
    }
    public String checkAnswer(boolean usrIn){
        boolean checker = false;
        String correct = "Correct!";
        String incorrect = "Incorrect... ";
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