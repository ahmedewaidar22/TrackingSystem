package tech.ops.tracker.cruddemo.entity;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name="group_table")
public class group {
	//define fields
	@Id
	 @Column(name = "group_id", updatable = false, nullable = false, columnDefinition = "VARCHAR(255)")
    @Type(type = "uuid-char")
	private UUID group_id;
	@Column(nullable = false ,name="group_name")
	private String group_name;

	  @OneToOne(mappedBy = "group")
	    private project project;
	
	   public project getProject() {
		return project;
	}
	public void setProject(project project) {
		this.project = project;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	   @JoinTable(name="group_user",
	   			joinColumns = @JoinColumn(name="group_id",referencedColumnName = "group_id"),
	   			inverseJoinColumns = @JoinColumn(name="user_id",referencedColumnName="id"))
	   Set<User> user;
	
	    public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
		public UUID getGroup_id() {
		return group_id;
	}
	public group() {
		
	}
	public group(UUID group_id, String group_name) {
		
		this.group_id = group_id;
		this.group_name = group_name;
	}

	public void setGroup_id(UUID group_id) {
		this.group_id = UUID.randomUUID();
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	@Override
	public String toString() {
		return "group [group_id=" + group_id + ", group_name=" + group_name + ", project=" + project + ", user=" + user
				+ "]";
	}


}
