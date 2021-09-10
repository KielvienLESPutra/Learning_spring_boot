package my.id.kielvien.lesp.learning_spring_boot.models;

import java.util.UUID;

public class GeneralRequestModel {
	private UUID transactionId;
	private Long time;
	private String language;
	private Object body;
	
	public GeneralRequestModel(UUID transactionId, Long time, String language, Object body) {
		this.transactionId = java.util.UUID.randomUUID();
		this.time = System.currentTimeMillis();
		this.language = language;
		this.body = body;
	}
	
	public UUID getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
}
