package com.example.demo;

import com.example.demo.inspection.InspectionConstant;
import com.example.demo.inspection.InspectionSolver;
import com.example.demo.inspection.InspectionSolverChooser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class InspectionTest {

    @Autowired
    private InspectionSolverChooser chooser;

    @Test
    public void test(){
        String taskType = InspectionConstant.INSPECTION_CONSTANT_TASK_TYPE_SHIPPING;
        Long orderId = 12345l;
        Long userId = 1222l;
        InspectionSolver solver = chooser.choose(taskType);
        if(solver == null){
            throw new RuntimeException(taskType+"任务类型暂时无法处理");
        }
        solver.solve(orderId,userId);
    }

}
