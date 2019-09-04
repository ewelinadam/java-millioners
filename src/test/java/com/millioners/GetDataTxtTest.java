package com.millioners;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GetDataTxtTest {
    @Test
    public void shouldReturnListSize96AndContainABCBLetters () throws IOException {
        //given
        GetDataTxt getDataTxt = new GetDataTxt();
        //when
        List<String> result = getDataTxt.createListFromTxtData(GetDataTxt.PATH);

        //then
        assertThat(result).hasSize(96).contains("A","B","C","D");
    }
}
