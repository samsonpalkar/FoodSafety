package com.riskManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by samson.palkar on 2/13/2017.
 */
@SpringBootApplication
@Controller
public class Application extends SpringBootServletInitializer {

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
    public String searchForms() throws Exception{
        return "selfInspection/manager/manageSelfInspectionChecklist";
    }

    /**
     * Beans
     */

}
