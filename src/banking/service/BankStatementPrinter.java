package banking.service;

import banking.bank.Bank;
import banking.bank.Transaction;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Bank statement printer.
 *
 */
public class BankStatementPrinter {
    public static boolean printStatement(Bank bank) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************************");
        System.out.println("Welcome to "+bank.getInstitutionName());
        System.out.println("**********************************************************");
        System.out.println("Please enter your account number:");

        return printStatementOf(bank, scanner);
    }

    public static boolean printStatementOf(Bank bank, Scanner scanner) {
        // TODO:
        return false;
    }
}