package tech.ops.tracker.cruddemo.entity;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="users")
public class user {
	
	//define fields
	@Id
	 @Column(name = "user_id", updatable = false, nullable = false, columnDefinition = "VARCHAR(255)")
    @Type(type = "uuid-char")
	private UUID user_id;
	@Column(nullable = false ,name="full_name")
	private String full_name;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private String mobile;
	@Column(name="isActive")
	private int isActive;
	@Column(name="position")
	private String position;
	
    @ManyToMany(mappedBy = "user")
    Set<group> group;
		
	public Set<group> getgroup() {
		return group;
	}


	public void setgroup(Set<group> group) {
		this.group = group;
	}


	public user() {
		
	}
	

	public user(UUID user_id, String full_name, String email, String mobile, int isActive, String position) {
		this.user_id = user_id;
		this.full_name = full_name;
		this.email = email;
		this.mobile = mobile;
		this.isActive = isActive;
		this.position = position;
	}


	public UUID getUser_id() {
		return user_id;
	}

	public void setUser_id(UUID user_id) {
		this.user_id = UUID.randomUUID();
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
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

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "user [user_id=" + user_id + ", full_name=" + full_name + ", email=" + email + ", mobile=" + mobile
				+ ", isActive=" + isActive + ", position=" + position + ", group=" + group + "]";
	}




	
}
