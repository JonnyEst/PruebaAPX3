package com.bbva.wikj.dto.testapx;

public class PaymentListOut {

    private Integer monthlyInterest;
    private Integer monthlyAmount;
    private Integer totalAmount;


    public Integer getMonthlyInterest() {
        return monthlyInterest;
    }

    public void setMonthlyInterest(Integer monthlyInterest) {
        this.monthlyInterest = monthlyInterest;
    }

    public Integer getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(Integer monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "paymentListOut{" +
                "monthlyInterest=" + monthlyInterest +
                ", monthlyAmount=" + monthlyAmount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
