package com.millioners;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
public class HelpWheel {
    private Random random;

    public String answerHelp(String correctAnswer) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (int i = 0; i < 3; i++) {
            list.add(correctAnswer);
        }

        return list.get(random.nextInt(list.size()));
    }
}
