package com.kkhindigyan.app.model;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties(prefix = "myapp") 
//@Component
public class KKHindiGyan {

	private Integer channelId;
	private String channelName;
	private String websiteUrl;
	
	private Technology technology;
	private List<String> topics;
	private Map<String,Integer> TechFee;
	
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	
	
	public Technology getTechnology() {
		return technology;
	}
	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
	public List<String> getTopics() {
		return topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	public Map<String, Integer> getTechFee() {
		return TechFee;
	}
	public void setTechFee(Map<String, Integer> techFee) {
		TechFee = techFee;
	}
	@Override
	public String toString() {
		return "KKHindiGyan [channelId=" + channelId + ", channelName=" + channelName + ", websiteUrl=" + websiteUrl
				+ ", technology=" + technology + ", topics=" + topics + ", TechFee=" + TechFee + "]";
	}
}
