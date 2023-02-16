//Mini Project on Quiz Program
import java.util.ArrayList;
import java.util.Scanner;

class Question {
      String question;
      String optionA;
      String optionB;
      String optionC;
      String optionD;
      String answer;
     /*
     record:
     record Question(String question, String optionA, String optionB, String optionC, String optionD, String answer)
      */

    public Question(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getOptionA() {
        return this.optionA;
    }

    public String getOptionB() {
        return this.optionB;
    }

    public String getOptionC() {
        return this.optionC;
    }

    public String getOptionD() {
        return this.optionD;
    }
    //this will ignore the 'A' 'a' case-sensitive problem
    public boolean checkAnswer(String answer) {
        return this.answer.equalsIgnoreCase(answer);
    }
}
public class QuizProgram {
     ArrayList<Question> questions;
     int score;

    public QuizProgram() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void startQuiz() {
        Scanner scan = new Scanner(System.in);
        for (Question question : this.questions) {
            System.out.println(question.getQuestion());
            System.out.println("A) " + question.getOptionA());
            System.out.println("B) " + question.getOptionB());
            System.out.println("C) " + question.getOptionC());
            System.out.println("D) " + question.getOptionD());
            System.out.print("Your answer: ");
           String answer = scan.nextLine();
            if (question.checkAnswer(answer)) {
                this.score++;
            }

        }
        System.out.println("You got " + this.score + " out of " + this.questions.size() + " questions correct.");
        int percentage;
        percentage = this.score*100/this.questions.size();
        System.out.println("Marks = " + this.score);
        System.out.println("Percentage = " + percentage + "%");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready to start Yes/No: ");
        String s = input.nextLine();
        if (s.equals("Yes")){
            QuizProgram quiz = new QuizProgram();
            quiz.addQuestion(new Question("1. Which of these class can generate an array which can increase and decrease in size automatically?", "ArrayList", "DynamicList", "LinkedList", "MallocList", "A"));
            quiz.addQuestion(new Question("2. Which of these method is used to add elements in the array?", ".plus", ".add", ".select", ".addAll ", "B"));
            quiz.addQuestion(new Question("3. Which of these standard collection classes implements a dynamic array?","AbstractList","LinkedList","ArrayList","List","C"));
            quiz.addQuestion(new Question("4. Which of these method is used to copy a ArrayList?",".copy()",".copyArrayList",".copyList",".clone()","D"));
            quiz.addQuestion(new Question("5. Which of these method of ArrayList class is used to obtain present size of an object?","index()","length()","size()","capacity","c"));
            quiz.addQuestion(new Question("6. Which component is used to compile, debug and execute the java programs?","JRE","JIT","JVM","JDK","D"));
            quiz.addQuestion(new Question("7. Which one of the following is not a Java feature?","Object Oriented","Pointers","Portable","Dynamic","B"));
            quiz.addQuestion(new Question("8. When we implement an interface method, it must be declared as?","Private","Protected","Public","Friend","C"));
            quiz.addQuestion(new Question("9. Which data structure is mainly used for implementing the recursive algorithm?","Queue","LinkedList","Binary Search","Stack","D"));
            quiz.addQuestion(new Question("10 Who creates Java","Denish Ritchie", "James Gosling","Bjarne Stourstrop","Denial","B"));
            quiz.startQuiz();
        } else {
            System.out.println("Okay be ready for next time.");
        }

    }
}
