package com.example.demo.inspection2.domain;

public enum StrategyConstant {

    BalanceDeduction("com.example.demo.inspection2.solver.BalanceDeduction"),
    IdCardDeduction("com.example.demo.inspection2.solver.IdCardDeduction");

    String type;

    private StrategyConstant(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
