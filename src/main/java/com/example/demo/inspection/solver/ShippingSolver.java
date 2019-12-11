package com.example.demo.inspection.solver;

import com.example.demo.inspection.InspectionConstant;
import com.example.demo.inspection.InspectionSolver;
import org.springframework.stereotype.Component;

@Component
public class ShippingSolver extends InspectionSolver {

    @Override
    public void solve(Long orderId, Long userId) {
        System.out.println("shipping "+ orderId);
    }

    @Override
    public String[] supports() {
        return new String[]{InspectionConstant.INSPECTION_CONSTANT_TASK_TYPE_SHIPPING};
    }
}
