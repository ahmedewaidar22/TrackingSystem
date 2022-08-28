package tech.ops.tracker.cruddemo.entity;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name="project")
public class project {
	//define fields
	@Id
	 @Column(name = "projects_id", updatable = false, nullable = false, columnDefinition = "VARCHAR(255)")
    @Type(type = "uuid-char")
	private UUID projects_id;
	@Column(nullable = false ,name="project_name")
	private String project_name;

	@Column(name="startdate")
	private String startdate;
	@Column(name="enddate")
	private String enddate;
	@Column(name="isactive")
	private int isactive;
	
	@Column(name="SLA")
	private String SLA;
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "group_id", referencedColumnName = "group_id")
	    private group group;
	
	 @ManyToOne
	    customer customer;
	 
		public project() {
		}
	 
	public project(UUID projects_id, String project_name, String startdate, String enddate, int isactive, String sLA,
			tech.ops.tracker.cruddemo.entity.group group, tech.ops.tracker.cruddemo.entity.customer customer) {
		
		this.projects_id = projects_id;
		this.project_name = project_name;
		this.startdate = startdate;
		this.enddate = enddate;
		this.isactive = isactive;
		SLA = sLA;
		this.group = group;
		this.customer = customer;
	}

	public UUID getProjects_id() {
		return projects_id;
	}

	public void setProjects_id(UUID projects_id) {
		this.projects_id = projects_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public int getIsactive() {
		return isactive;
	}

	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}

	public String getSLA() {
		return SLA;
	}

	public void setSLA(String sLA) {
		SLA = sLA;
	}

	public group getGroup() {
		return group;
	}

	public void setGroup(group group) {
		this.group = group;
	}

	public customer getCustomer() {
		return customer;
	}

	public void setCustomer(customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "project [projects_id=" + projects_id + ", project_name=" + project_name + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", isactive=" + isactive + ", SLA=" + SLA + ", group=" + group
				+ ", customer=" + customer + "]";
	}
	 
	

}
