package com.millioners;

import java.io.IOException;
import java.util.*;

/**
 * Millioners. My own project, written at the beginnig of course. Needs refactoring.
 */
public class Millioners {

    private static GetDataTxt getData = new GetDataTxt();

    private static QuestionList questionList = new QuestionList(getData);

    private static GenerateQuestions generateQuestions = new GenerateQuestions();

    private static HelpWheel helpWheel = new HelpWheel(new Random());

    public static void main(String[] args)  {
        System.out.println("Witaj w Milionerach !\n");
        System.out.println("Na pytania odpowiadaj: A, B, C, D, Q - rezygnuję, H - koło ratunkowe\n");

        Set<QuestionCollection> questions
                = null;
        try {
            questions = generateQuestions.generate(questionList.createList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<Integer, String> prize = PrizeSum.prizeValues();

        List<String> givenAnswers = new ArrayList<>();
        int correctAnswerCount = 0;

        for (QuestionCollection q : questions) {
            System.out.println(q.getQuestion());
            Scanner scanner = new Scanner(System.in);
            String ans = scanner.nextLine();

            if (ans.equalsIgnoreCase("H")) {
                if (givenAnswers.contains("H")) {
                    System.out.println("Wykorzystałeś już koło ratunkowe, podaj odpowiedź lub zrezygnuj.");
                } else {
                    String hint = helpWheel.answerHelp(q.getAnswer());
                    System.out.println("Publiczność podpowiada odpowiedź: " + hint);
                    givenAnswers.add("H");
                }
                ans = scanner.nextLine();
            }

            if (ans.equalsIgnoreCase(q.getAnswer())) {
                correctAnswerCount++;
                givenAnswers.add(ans);
            } else if (ans.equalsIgnoreCase("Q")) {
                System.out.println(prize.get(correctAnswerCount));
                break;
            } else {
                System.out.println("Przegrałeś");
                break;
            }
        }
        if (correctAnswerCount == 6) {
            System.out.println("Wygrywasz MILION !!!");
        }

    }
}
