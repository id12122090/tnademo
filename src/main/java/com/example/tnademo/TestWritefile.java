package com.example.tnademo;

import java.io.File;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.tnademo.domain.AdsCampaign;
import com.example.tnademo.domain.Creatives;
import com.example.tnademo.domain.Insights;
import com.example.tnademo.domain.Platforms;
import com.example.tnademo.domain.TargetAudiance;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestWritefile {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		List<String> languages = Arrays.asList("EN", "VI");
//		List<String> genders = Arrays.asList("M", "F");
//		List<Integer> ageRange = Arrays.asList( 20, 30);
//		List<String> locations = Arrays.asList("Switzerland", "Spain");
//		List<String> interests = Arrays.asList("Docker", "DevOps");
//		List<String> KeyWords = Arrays.asList("NoOps", "AWS");
//		TargetAudiance ta = new TargetAudiance(1L,languages, genders, ageRange, locations, interests, KeyWords);
//
//		
//		String header = "header";
//		String header_1 = "header_1";
//		String header_2 = null;//"header_2";
//		String description = "description";
//		String url = "url";
//		String image = "image";
//		Creatives c = new Creatives(1L,header, header_1, header_2, description, url, image);
//		
//	    long impressions = 20436;
//	    long clicks = 420;
//	    long website_visits = 378;
//	    float nanos_score = 0.99f;
//	    float cost_per_click = 0.99f;
//	    float click_through_rate = 0.013f;
//	    float advanced_kpi_1 = 3.9f;
//	    float advanced_kpi_2 = 3.9f;
//	    Insights i = new Insights(1L,impressions, clicks, website_visits, nanos_score, cost_per_click, click_through_rate, advanced_kpi_1, advanced_kpi_2);
//
//	    String status = "status";
//	    long totalBudget = 40;
//	    long remainingBudget = 12;
//	    Long startDate = 1530568800000L;
//	    Long endDate = 1532901600000L;
//	    TargetAudiance targetAudiance = ta;
//	    Creatives creatives = c;
//	    Insights insights = i;
////	    Platforms p = new Platforms(1L,"facebook",status, totalBudget, remainingBudget, startDate, endDate, targetAudiance, creatives, insights);
////	    Platforms p1 = new Platforms(1L,"",status, totalBudget, remainingBudget, startDate, endDate, targetAudiance, creatives, insights);
//	    Platforms p2 = new Platforms(1L,"google",status, totalBudget, remainingBudget, startDate, endDate, targetAudiance, creatives, insights);
//	
//	    Map<String, Platforms> platforms = Collections.unmodifiableMap(Stream.of(
////                new SimpleEntry<>("facebook", p),
////                new SimpleEntry<>("instagram", p1),
//                new SimpleEntry<>("google", p2))
//                .collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())));
//	
//	    long id = 12;
//	    String name = "name";
//	    String goal = "goal";
//	    long totalBudget1 = 120;
//	    String status1 = "status";
//	    Map<String, Platforms> platforms1 = platforms;
//	    AdsCampaign adsC = new AdsCampaign(id, name, goal, totalBudget1, status1, platforms);
//	    
//	    ObjectMapper mapper = new ObjectMapper();
//	    AdsCampaign obj = adsC;
//
//	    //Object to JSON in file
//	    try {
//			mapper.writeValue(new File("/Users/un/Desktop/test1.json"), obj);
//			
//		    //Object to JSON in String
//		    String jsonInString = mapper.writeValueAsString(obj);
//
//		} catch (JsonGenerationException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (JsonMappingException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//
//	
//	}

}
