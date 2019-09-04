package com.millioners;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class QuestionCollectionTest {
    @Test
    public void shouldReturnSizeOneWhenParamIsListOfSixElemAndAnswerAns() {
        //given
        QuestionCollection questionCollection = new QuestionCollection();
        //when
        List<QuestionCollection> result
                = questionCollection.createListOfQuestionObjects(Arrays.asList("Q", "A", "B", "C", "D", "Ans"));
        String answer = result.get(0).getAnswer();
        //then
        assertThat(result).hasSize(1);
        Assert.assertEquals("Ans", answer);
    }
    @Test
    public void shouldReturnQuestionQABCDWithProperFormat () {
        //given
        QuestionCollection questionCollection = new QuestionCollection();
        //when
        List<QuestionCollection> result
                = questionCollection.createListOfQuestionObjects(Arrays.asList("Q", "A", "B", "C", "D", "Ans"));
        String question = result.get(0).getQuestion();
        //then

        Assert.assertEquals("Q\nA\nB\nC\nD\n", question);
    }

}
