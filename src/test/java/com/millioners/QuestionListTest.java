package com.millioners;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class QuestionListTest {
    @Test
    public void shouldReturnSizeOneWhenSixElemAndAnswerAns() throws IOException {
        //given
        GetDataTxt getDataTxt = Mockito.mock(GetDataTxt.class);
        QuestionList questionList = new QuestionList(getDataTxt);

        //when
        Mockito.when(getDataTxt.createListFromTxtData(GetDataTxt.PATH))
                .thenReturn(Arrays.asList("Q", "A", "B", "C", "D", "Ans"));
        List<QuestionCollection> result = questionList.createList();
        String answer = result.get(0).getAnswer();

        //then
        assertThat(result).hasSize(1);
        Assert.assertEquals("Ans", answer);
    }
    @Test
    public void shouldReturnSize16ForUploadedFile() throws IOException {
        //given
        GetDataTxt getDataTxt = new GetDataTxt();
        QuestionList questionList = new QuestionList(getDataTxt);

        //when
        List<QuestionCollection> result = questionList.createList();


        //then
        assertThat(result).hasSize(16);

    }
}
