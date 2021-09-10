package my.id.kielvien.lesp.learning_spring_boot.models;

import java.util.UUID;

public class GeneralResponseModel {
	private UUID transactionId;
	private String statusCode;
	private String language;
	private String message;
	private Long time;
	private Object body;
	
	public GeneralResponseModel(UUID transactionId, String statusCode, String language, String message, Long time, Object body) {
		this.transactionId = java.util.UUID.randomUUID();;
		this.statusCode = statusCode;
		this.language = language;
		this.message = message;
		this.time = System.currentTimeMillis();
		this.body = body;
	}
	
	public UUID getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(UUID transactionId) {
		this.transactionId = transactionId;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
}
