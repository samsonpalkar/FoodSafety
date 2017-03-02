package com.riskManagement.managerChecklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by samson.palkar on 2/21/2017.
 */
@Controller
public class ManagerChecklistController{
    public ManagerChecklistController(){}
    @Autowired
    public ManagerChecklistService managerChecklistService;
}
