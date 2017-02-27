package com.riskManagement;

import com.riskManagement.managerChecklist.ManagerChecklistController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by samson.palkar on 2/13/2017.
 */
@SpringBootApplication
@Controller
public class Application extends SpringBootServletInitializer {
    @Autowired
    public ManagerChecklistController managerChecklistController;
/*    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Main end point for handling requests.
     */
    @RequestMapping("/")
    public String mainEndPoint() throws Exception{
       return "index";
    }

    /**
     * Main end point for handling requests.
     */
    @RequestMapping("/app")
    public String index() throws Exception{
        return mainEndPoint();
    }

    /**
     * Main end point for handling requests.
     */
    @RequestMapping("/manageSelfInspectionChecklist")
    public ModelAndView searchForms() throws Exception{
        Map<String, List> model = new HashMap<String, List>();
        List list = (List) managerChecklistController.managerChecklistService.managerChecklistRepository.findAll();
        model.put("firstForm", list);
        String view = "selfInspection/manager/manageSelfInspectionChecklist";
        ModelAndView modelAndView = new ModelAndView(view, model);
        return modelAndView;
    }

    /**
     * Beans
     */

}
