package tech.ops.tracker.cruddemo.entity;

import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.Type;

import javax.persistence.*;


@Entity
@Table(name="task")
public class task {

@Id
@Column(name = "task_id", updatable = false, nullable = false, columnDefinition = "VARCHAR(255)")
@Type(type = "uuid-char")
	private UUID task_id;


@Column(name="TaskName")	
	private String TaskName;


@Column(name="StartDate")	
private String StartDate;

@Column(name="EndDate")
private String EndDate;

@Column(name="NumberOfMin")	
private int NumberOfMin;

@Column(name="TaskTag")	
private String TaskTag;

@Column(name="project_id")
private int project_id;

@ManyToOne
project project;

@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="task_user",
			joinColumns = @JoinColumn(name="task_id",referencedColumnName = "task_id"),
			inverseJoinColumns = @JoinColumn(name="user_id",referencedColumnName="user_id"))
Set<user> user;

public task() {

}


public task(UUID task_id, String taskName, String startDate, String endDate, int numberOfMin, String taskTag,
		int project_id, tech.ops.tracker.cruddemo.entity.project project,
		Set<tech.ops.tracker.cruddemo.entity.user> user) {
	super();
	this.task_id = task_id;
	TaskName = taskName;
	StartDate = startDate;
	EndDate = endDate;
	NumberOfMin = numberOfMin;
	TaskTag = taskTag;
	this.project_id = project_id;
	this.project = project;
	this.user = user;
}


public UUID getTask_id() {
	return task_id;
}

public void setTask_id(UUID task_id) {
	this.task_id = UUID.randomUUID();
}

public String getTaskName() {
	return TaskName;
}

public void setTaskName(String taskName) {
	TaskName = taskName;
}

public String getStartDate() {
	return StartDate;
}

public void setStartDate(String startDate) {
	StartDate = startDate;
}

public String getEndDate() {
	return EndDate;
}

public void setEndDate(String endDate) {
	EndDate = endDate;
}

public int getNumberOfMin() {
	return NumberOfMin;
}

public void setNumberOfMin(int numberOfMin) {
	NumberOfMin = numberOfMin;
}

public String getTaskTag() {
	return TaskTag;
}

public void setTaskTag(String taskTag) {
	TaskTag = taskTag;
}

public int getProject_id() {
	return project_id;
}

public void setProject_id(int project_id) {
	this.project_id = project_id;
}

public project getProject() {
	return project;
}

public void setProject(project project) {
	this.project = project;
}

public Set<user> getUser() {
	return user;
}

public void setUser(Set<user> user) {
	this.user = user;
}

@Override
public String toString() {
	return "tasks [task_id=" + task_id + ", TaskName=" + TaskName + ", StartDate=" + StartDate + ", EndDate=" + EndDate
			+ ", NumberOfMin=" + NumberOfMin + ", TaskTag=" + TaskTag + ", project_id=" + project_id + ", project="
			+ project + ", user=" + user + "]";
}




}
