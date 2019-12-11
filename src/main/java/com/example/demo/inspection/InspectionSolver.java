package com.example.demo.inspection;


/**
 * 策略模式 处理过多if-else
 */
public abstract class InspectionSolver {

    public abstract void solve(Long orderId, Long userId);

    public abstract String [] supports();

}
