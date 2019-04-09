import java.util.*;
public class QuestionTester
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Create Standard Questions
        Question a = new Question("What is my favorite color","red");
        Question a1 = new Question("What is my favorite food","pizza");
        Question a2 = new Question("What is my favorite car brand","audi");
        String question = a.getQuestion();
        System.out.println(question);
        System.out.print("Answer? : ");
        String checkedAns = a.checkAnswer(input.nextLine());
        System.out.println(checkedAns);
        question = a1.getQuestion();
        System.out.println(question);
        System.out.print("Answer? : ");
        checkedAns = a1.checkAnswer(input.nextLine());
        System.out.println(checkedAns);
        question = a2.getQuestion(); 
        System.out.println(question);
        System.out.print("Answer? : ");
        checkedAns = a2.checkAnswer(input.nextLine());
        System.out.println(checkedAns);
        // Create True/false Question
        TrueFalse b = new TrueFalse("Do I enjoy school?",false);
        TrueFalse b1 = new TrueFalse("Do I like watching football?",false);
        TrueFalse b2 = new TrueFalse("Do I enjoy gaming?",true);
        question = b.getQuestion();
        System.out.println(question);
        System.out.print("Answer? : ");
        checkedAns = b.checkAnswer(input.nextBoolean());
        System.out.println(checkedAns);
        question = b1.getQuestion();
        System.out.println(question);
        System.out.print("Answer? : ");
        checkedAns = b1.checkAnswer(input.nextBoolean());
        System.out.println(checkedAns);
        question = b2.getQuestion();
        System.out.println(question);
        System.out.print("Answer? : ");
        checkedAns = b2.checkAnswer(input.nextBoolean());
        System.out.println(checkedAns);
        Numeric c = new Numeric("What year was I born?",2002);
        Numeric c1 = new Numeric("What year was last year?",2018);
        Numeric c2 = new Numeric("What year is next year?",2020);
        question = c.getQuestion();
        System.out.println(question);
        System.out.print("Answer? : ");
        checkedAns = c.checkAnswer(input.nextInt());
        System.out.println(checkedAns);
        question = c1.getQuestion();
        System.out.println(question);
        System.out.print("Answer? : ");
        checkedAns = c1.checkAnswer(input.nextInt());
        System.out.println(checkedAns);
        question = c2.getQuestion();
        System.out.println(question);
        System.out.print("Answer? : ");
        checkedAns = c2.checkAnswer(input.nextInt());
        System.out.println(checkedAns);
        String correctCount = a.displayCorrect();
        System.out.println(correctCount);
    }
    }