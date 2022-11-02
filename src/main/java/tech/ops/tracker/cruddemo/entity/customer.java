package tech.ops.tracker.cruddemo.entity;


import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Type;

@Entity
@Table(name="customer")
public class customer {
	@Id
    @Column(name = "customer_id", updatable = false, nullable = false, columnDefinition = "VARCHAR(255)")
    @Type(type = "uuid-char")
		private UUID customer_id;
	@NotBlank
	@Column(name="FullName")
	private String FullName;
	  @NotBlank
	@Column(name="email")	
	private String email;
	@Column(name="mobile")	
	private String mobile;
	@Column(name="Address")	
	private String Address;
//	@OneToMany(mappedBy = "projects")
//    private List<projects> projects;
    
	public UUID getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(UUID customer_id) {
		this.customer_id = UUID.randomUUID();
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public customer() {

	}
	public customer(UUID customer_id, String fullName, String email, String mobile, String address) {

		this.customer_id = customer_id;
		FullName = fullName;
		this.email = email;
		this.mobile = mobile;
		Address = address;
	}
	@Override
	public String toString() {
		return "customer [customer_id=" + customer_id + ", FullName=" + FullName + ", email=" + email + ", mobile="
				+ mobile + ", Address=" + Address + "]";
	}
	
	

}
