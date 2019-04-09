public class Question
{
    private String usrQuestion;
    private String usrAnswer;
    static public int correctCounter = 0;
	public Question(String question, String answer) {
        usrQuestion = question;
        usrAnswer = answer.toLowerCase();
    }
    public Question(String question){
        usrQuestion = question;
    }
    public String getAnswer(){
        return usrAnswer;
    }
    public String getQuestion(){
        return usrQuestion;
    }
    public String checkAnswer(String usrIn){
        boolean checker = false;
        String correct = "Correct!";
        String incorrect = "Incorrect... ";
        String usrLower = usrIn.toLowerCase();
        if (usrLower.equals(usrAnswer)){
            checker = true;
            correctCounter++;
            return correct;
        }
        else {
            checker = false;
            return incorrect + usrAnswer;
        }
    }  
    public String displayCorrect(){
        String correctSentence = "You Answered " + correctCounter + " questions correctly";
        return correctSentence;
    }
}