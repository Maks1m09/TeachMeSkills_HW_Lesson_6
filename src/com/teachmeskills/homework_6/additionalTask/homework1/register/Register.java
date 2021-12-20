package com.teachmeskills.homework_6.additionalTask.homework1.register;

import com.teachmeskills.homework_6.additionalTask.homework1.contract.Contract;

public class Register {
    public Contract[] contracts = new Contract[10];
    public int count = 0;

    public void addDocumentAndSave(Contract contract) {
        contracts[count] = contract;
        count++;
        if (count < 10) {
            System.out.println("we can add another document and save");
        } else if (count >= 10) {
            System.out.println("we cannot add another document and save");
        }
    }

    public void Info() {
        for (Contract array : contracts) {
            System.out.println(array);
        }
    }
}
