package com.bbva.wikj.dto.testapx;

import java.util.List;

public class DataOutTest {

    private Integer amount;
    private Integer InterestTotal;
    private String frecuency;
    private List<PaymentListOut> Instalments;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getInterestTotal() {
        return InterestTotal;
    }

    public void setInterestTotal(Integer interestTotal) {
        InterestTotal = interestTotal;
    }

    public String getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(String frecuency) {
        this.frecuency = frecuency;
    }

    public List<PaymentListOut> getInstalments() {
        return Instalments;
    }

    public void setInstalments(List<PaymentListOut> instalments) {
        Instalments = instalments;
    }

    @Override
    public String toString() {
        return "DataOut{" +
                "amount=" + amount +
                ", InterestTotal=" + InterestTotal +
                ", frecuency='" + frecuency + '\'' +
                ", Instalments=" + Instalments +
                '}';
    }
}
