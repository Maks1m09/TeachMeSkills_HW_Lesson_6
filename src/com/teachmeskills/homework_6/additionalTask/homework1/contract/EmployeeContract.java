package com.teachmeskills.homework_6.additionalTask.homework1.contract;

import com.teachmeskills.homework_6.additionalTask.homework1.contract.Contract;

import java.util.Date;

public class EmployeeContract extends Contract {
    public int contractExpirationDate;
    public String employeeName;

    public EmployeeContract() {
        super();
    }

    public EmployeeContract(int contractExpirationDate, String employeeName, Date dataDocument, int numberDocument) {
        super(dataDocument, numberDocument);
        this.contractExpirationDate = contractExpirationDate;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "EmployeeContract{" +
                "dataDocument=" + dataDocument +
                ", numberDocument=" + numberDocument +
                ", contractExpirationDate=" + contractExpirationDate +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
