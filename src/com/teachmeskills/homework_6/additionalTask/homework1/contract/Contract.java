package com.teachmeskills.homework_6.additionalTask.homework1.contract;

import java.util.Date;

public abstract class Contract {
    public Date dataDocument;
    public int numberDocument;

    public Contract() {
    }

    public Contract(Date dataDocument, int numberDocument) {
        this.dataDocument = dataDocument;
        this.numberDocument = numberDocument;
    }
}
