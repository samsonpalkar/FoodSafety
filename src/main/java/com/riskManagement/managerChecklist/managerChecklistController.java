package com.riskManagement.managerChecklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by samson.palkar on 2/21/2017.
 */
@Controller
public class ManagerChecklistController {
    public ManagerChecklistController(){}
    @Autowired
    public ManagerChecklistService managerChecklistService;
}
