package com.teachmeskills.homework_6.additionalTask.homework1.contract;

import com.teachmeskills.homework_6.additionalTask.homework1.contract.Contract;

import java.util.Date;

public class SupplyContract extends Contract {
    public String typeOfGoods;
    public int numberOfGoods;

    public SupplyContract() {
    }

    public SupplyContract(String typeOfGoods, int numberOfGoods, Date dataDocument, int numberDocument) {
        super(dataDocument, numberDocument);
        this.typeOfGoods = typeOfGoods;
        this.numberOfGoods = numberOfGoods;
    }

    @Override
    public String toString() {
        return "SupplyContract{" +
                "dataDocument=" + dataDocument +
                ", numberDocument=" + numberDocument +
                ", typeOfGoods='" + typeOfGoods + '\'' +
                ", numberOfGoods=" + numberOfGoods +
                '}';
    }
}
