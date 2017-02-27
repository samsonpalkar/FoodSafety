package com.riskManagement.managerChecklist;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by samson.palkar on 2/21/2017.
 */
@Entity
public class ManagerChecklist {
    public ManagerChecklist(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    @Column
    public Integer managerCheckListID;

    @Column
    @JsonProperty
    public String managerName;

    @Column
    @JsonProperty
    public boolean managerOnSite;
}
