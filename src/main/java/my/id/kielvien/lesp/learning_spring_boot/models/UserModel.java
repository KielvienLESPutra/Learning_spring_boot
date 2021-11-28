package my.id.kielvien.lesp.learning_spring_boot.models;
import java.util.UUID;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "users")
public class UserModel {

	@Id
	@GeneratedValue
	private UUID id;
	private String name;
	private String address;
	private String telp;
	private String email;
	
	public UserModel(@JsonProperty("id") UUID id, 
			@JsonProperty("name") String name, 
			@JsonProperty("address") String address, 
			@JsonProperty("telp") String telp, 
			@JsonProperty("email") String email) {
		this.id = id;
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
