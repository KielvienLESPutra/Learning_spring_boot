package my.id.kielvien.lesp.learning_spring_boot.models;

import java.util.UUID;

public class UserModel {
	private UUID id;
	private String name;
	private String address;
	private String telp;
	private String email;
	
	public UserModel(UUID id, String name, String address, String telp, String email) {
		this.id = java.util.UUID.randomUUID();
		this.name = name;
		this.address = address;
		this.telp = telp;
		this.email = email;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelp() {
		return telp;
	}
	public void setTelp(String telp) {
		this.telp = telp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", address=" + address + ", telp=" + telp + ", email=" + email
				+ "]";
	}
}
