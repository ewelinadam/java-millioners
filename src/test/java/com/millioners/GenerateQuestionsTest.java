package com.millioners;

import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class GenerateQuestionsTest {
    @Test
    public void shouldReturnSetSizeEquals6() throws IOException {
        //given
        GetDataTxt getDataTxt = new GetDataTxt();
        QuestionList questionList = new QuestionList(getDataTxt);
        GenerateQuestions generateQuestions = new GenerateQuestions();



        //when
        Set<QuestionCollection> result
                = generateQuestions.generate(questionList.createList());

        //then
        assertThat(result).hasSize(6);
    }
}
