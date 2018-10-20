package com.example.tnademo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "impressions",
    "clicks",
    "website_visits",
    "nanos_score",
    "cost_per_click",
    "click_through_rate",
    "advanced_kpi_1",
    "advanced_kpi_2"
})
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Insights {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
    private Long id;
	
    @JsonProperty("impressions")
    public long impressions;
    @JsonProperty("clicks")
    public long clicks;
    @JsonProperty("website_visits")
    @Nullable
    public Long websiteVisits;
    @JsonProperty("nanos_score")
    public Float nanosScore;
    @JsonProperty("cost_per_click")
    public float costPerClick;
    @JsonProperty("click_through_rate")
    public float clickThroughRate;
    @JsonProperty("advanced_kpi_1")
    public Float advancedKpi1;
    @JsonProperty("advanced_kpi_2")
    public Float advancedKpi2;

}
