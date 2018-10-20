
package com.example.tnademo.domain;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "goal", "total_budget", "status", "platforms" })
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdsCampaign {

	@Id
	@JsonProperty("id")
	public long id;
	
	@JsonProperty("name")
	public String name;
	
	@JsonProperty("goal")
	public String goal;
	
	@JsonProperty("total_budget")
	public long totalBudget;
	
	@JsonProperty("status")
	public String status;
	
	@JsonProperty("platforms")
	@OneToMany
	@JoinColumn(name = "ads_campaign_fk")
	@MapKey(name = "platformname")
	public Map<String, Platforms> platforms;

}
