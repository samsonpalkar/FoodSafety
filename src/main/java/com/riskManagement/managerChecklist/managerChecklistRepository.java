package com.riskManagement.managerChecklist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by samson.palkar on 2/21/2017.
 */
@Repository
public interface ManagerChecklistRepository extends CrudRepository<ManagerChecklist, Integer> {



}
