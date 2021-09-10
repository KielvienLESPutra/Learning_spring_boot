package my.id.kielvien.lesp.learning_spring_boot.models;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KprClientModel{
	private UUID id;
	private UUID idClient;
	private double total;
	private double dp;
	private double loanInterest;
	private double instalment;
	
	public KprClientModel(@JsonProperty("id") UUID id,
			@JsonProperty("idClient") UUID idClient,
			@JsonProperty("total") double total,
			@JsonProperty("dp") double dp,
			@JsonProperty("loanInterest") double loanInterest,
			@JsonProperty("instalment") double instalment) {
		this.id = id;
		this.idClient = java.util.UUID.randomUUID();
		this.total = total;
		this.dp = dp;
		this.loanInterest = loanInterest;
		this.instalment = instalment;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getIdClient() {
		return idClient;
	}
	public void setIdClient(UUID idClient) {
		this.idClient = idClient;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDp() {
		return dp;
	}
	public void setDp(double dp) {
		this.dp = dp;
	}
	public double getLoanInterest() {
		return loanInterest;
	}
	public void setLoanInterest(double loanInterest) {
		this.loanInterest = loanInterest;
	}
	public double getInstalment() {
		return instalment;
	}
	public void setInstalment(double instalment) {
		this.instalment = instalment;
	}

	@Override
	public String toString() {
		return "KprClientModel [id=" + id + ", idClient=" + idClient + ", total=" + total + ", dp=" + dp
				+ ", loanInterest=" + loanInterest + ", instalment=" + instalment + "]";
	}
}
