package com.teachmeskills.homework_6.additionalTask.homework1;

import com.teachmeskills.homework_6.additionalTask.homework1.contract.EmployeeContract;
import com.teachmeskills.homework_6.additionalTask.homework1.contract.FinancialInvoice;
import com.teachmeskills.homework_6.additionalTask.homework1.contract.SupplyContract;
import com.teachmeskills.homework_6.additionalTask.homework1.register.Register;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");
        Register register = new Register();
        register.addDocumentAndSave(new EmployeeContract(123123, "Tom", new Date(), 213));
        register.addDocumentAndSave(new FinancialInvoice(1456, 21312, new Date(), 110));
        register.addDocumentAndSave(new EmployeeContract(123123, "Tom", new Date(), 100));
        register.addDocumentAndSave(new EmployeeContract(123, "Tom", new Date(), 213));
        register.addDocumentAndSave(new FinancialInvoice(1456, 21312, new Date(), 120));
        register.addDocumentAndSave(new FinancialInvoice(1456, 10000, new Date(), 12));
        register.addDocumentAndSave(new SupplyContract("industrial", 1233, new Date(), 5));
        register.Info();
        System.out.println("End");
    }
}
