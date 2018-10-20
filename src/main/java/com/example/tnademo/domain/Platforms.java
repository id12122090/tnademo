
package com.example.tnademo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "total_budget",
    "remaining_budget",
    "start_date",
    "end_date",
    "target_audiance",
    "creatives",
    "insights"
})
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Platforms {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
	public Long id;
	
	@JsonIgnore
    public String platformname;

    @JsonProperty("status")
    public String status;
    
    @JsonProperty("total_budget")
    public long totalBudget;
    
    @JsonProperty("remaining_budget")
    public long remainingBudget;
    
    @JsonProperty("start_date")
    public Long startDate;
    
    @JsonProperty("end_date")
    public Long endDate;
    
    @JsonProperty("target_audiance")
    @OneToOne
    public TargetAudiance targetAudiance;
    
    @JsonProperty("creatives")
    @OneToOne
    public Creatives creatives;
    
    @JsonProperty("insights")
    @OneToOne
    public Insights insights;

}
