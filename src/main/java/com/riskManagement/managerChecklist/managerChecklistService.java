package com.riskManagement.managerChecklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by samson.palkar on 2/21/2017.
 */
@Service
public class ManagerChecklistService {
    public ManagerChecklistService(){}
    @Autowired
    public ManagerChecklistRepository managerChecklistRepository;
}
