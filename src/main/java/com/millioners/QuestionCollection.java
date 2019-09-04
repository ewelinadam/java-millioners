package com.millioners;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

//klasa która tworzy zbiór pytań z listy elementów Typu String
@AllArgsConstructor
@Getter
public class QuestionCollection {
    private String question;
    private String answer;

    public QuestionCollection() {
    }

    //metoda tworzy listę obiektów QuestionCollection
    public List<QuestionCollection> createListOfQuestionObjects(List<String> strings) {
        List<QuestionCollection> questionList = new ArrayList<>();

        for (int i = 0; i < strings.size(); i += 6) {
            StringBuilder builder = new StringBuilder();
            builder = builder.append(strings.get(i) + "\n")
                    .append(strings.get(i + 1) + "\n")
                    .append(strings.get(i + 2) + "\n")
                    .append(strings.get(i + 3) + "\n")
                    .append(strings.get(i + 4) + "\n");

            question = builder.toString();
            answer = strings.get(i + 5);

            questionList.add(new QuestionCollection(question, answer));
        }
        return questionList;
    }
}