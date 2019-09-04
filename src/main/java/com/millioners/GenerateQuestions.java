package com.millioners;

import java.util.*;

//klasa generująca 6 pytań do miliona
public class GenerateQuestions {
    private final int NUM_OF_QUEST = 6;

    public Set<QuestionCollection> generate(List<QuestionCollection> list) {

        Set<QuestionCollection> listToPlay = new HashSet<>();
        while (listToPlay.size() < NUM_OF_QUEST) {
            Random random = new Random();
            listToPlay.add(list.get(random.nextInt(list.size())));
        }
        return listToPlay;
    }
}
