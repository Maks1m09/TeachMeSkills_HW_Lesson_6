package com.teachmeskills.homework_6.additionalTask.homework1.contract;

import com.teachmeskills.homework_6.additionalTask.homework1.contract.Contract;

import java.util.Date;

public class FinancialInvoice extends Contract {
    public int departmentCode;
    public int TotalAmountForMonth;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int departmentCode, int totalAmountForMonth, Date dataDocument, int numberDocument) {
        super(dataDocument, numberDocument);
        this.departmentCode = departmentCode;
        TotalAmountForMonth = totalAmountForMonth;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "dataDocument=" + dataDocument +
                ", numberDocument=" + numberDocument +
                ", departmentCode=" + departmentCode +
                ", TotalAmountForMonth=" + TotalAmountForMonth +
                '}';
    }
}
