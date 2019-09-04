package com.millioners;


import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.List;

//klasa tworząca listę obieków QuestionCollection z zaczytanego pliku txt
@AllArgsConstructor
public class QuestionList {
    private GetDataTxt getDataTxt;

    public List<QuestionCollection> createList() throws IOException {
        QuestionCollection questionCollection = new QuestionCollection();
        return questionCollection.createListOfQuestionObjects(getDataTxt.createListFromTxtData(GetDataTxt.PATH));
    }
}
