package com.BNP.dto;

public class UpdateAccountDto {
    private String accountHolderName;
    private String accountHolderEmail;
    private String accountType;
    private double accountBalance;
    private String phoneNumber;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    public void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UpdateAccountDto() {

    }

    @Override
    public String toString() {
        return "UpdateAccountDto{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountHolderEmail='" + accountHolderEmail + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
