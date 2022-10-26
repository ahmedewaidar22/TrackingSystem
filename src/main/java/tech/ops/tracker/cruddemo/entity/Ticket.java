package tech.ops.tracker.cruddemo.entity;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
@Entity
@Table(name="Ticket")
public class Ticket {
	@Id
	 @Column(name = "ticket_id", updatable = false, nullable = false, columnDefinition = "VARCHAR(255)")
   @Type(type = "uuid-char")
	private UUID ticket_id;
	
	@Column(nullable = false ,name="ticket_name")
	private String ticket_name;
	
	@Column(nullable = false ,name="ticket_number")
	private String ticket_number;
	
	@Column(name="CreationDate")
	private String CreationDate;
	
	@Column(name="CreationBy")
	private String CreationBy;
	
	 @ManyToOne
	    customer customer;

	@Column(name="CreatedBy")
	private String CreatedBy;
	

	@Column(name="Source")
	private String Source;
	
	
	
	@Column(name="Title")
	private String Title;
	
	@Column(name="TicketType")
	private int TicketType;
	
	@Column(name="TicketPiority")
	private String TicketPiority;
	
	@Column(name="ReopenCount")
	private int ReopenCount;
	
	@Column(name="Resolution")
	private String Resolution;
	
	@Column(name="ResolvedBy")
	private String ResolvedBy;
	
	@Column(name="CurrentStatus")
	private String CurrentStatus;

	
	public Ticket() {
		
	}
	public Ticket(UUID ticket_id, String ticket_name, String ticket_number, String creationDate, String creationBy,
			tech.ops.tracker.cruddemo.entity.customer customer, String createdBy, String source, String title,
			int ticketType, String ticketPiority, int reopenCount, String resolution, String resolvedBy,
			String currentStatus) {
		
		this.ticket_id = ticket_id;
		this.ticket_name = ticket_name;
		this.ticket_number = ticket_number;
		CreationDate = creationDate;
		CreationBy = creationBy;
		this.customer = customer;
		CreatedBy = createdBy;
		Source = source;
		Title = title;
		TicketType = ticketType;
		TicketPiority = ticketPiority;
		ReopenCount = reopenCount;
		Resolution = resolution;
		ResolvedBy = resolvedBy;
		CurrentStatus = currentStatus;
	}

	
	public UUID getTicket_id() {
		return ticket_id;
	}


	public void setTicket_id(UUID ticket_id) {
		this.ticket_id =  UUID.randomUUID();
	}


	public String getTicket_name() {
		return ticket_name;
	}


	public void setTicket_name(String ticket_name) {
		this.ticket_name = ticket_name;
	}


	public String getTicket_number() {
		return ticket_number;
	}


	public void setTicket_number(String ticket_number) {
		this.ticket_number = ticket_number;
	}


	public String getCreationDate() {
		return CreationDate;
	}


	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}


	public String getCreationBy() {
		return CreationBy;
	}


	public void setCreationBy(String creationBy) {
		CreationBy = creationBy;
	}


	public customer getCustomer() {
		return customer;
	}


	public void setCustomer(customer customer) {
		this.customer = customer;
	}


	public String getCreatedBy() {
		return CreatedBy;
	}


	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}


	public String getSource() {
		return Source;
	}


	public void setSource(String source) {
		Source = source;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public int getTicketType() {
		return TicketType;
	}


	public void setTicketType(int ticketType) {
		TicketType = ticketType;
	}


	public String getTicketPiority() {
		return TicketPiority;
	}


	public void setTicketPiority(String ticketPiority) {
		TicketPiority = ticketPiority;
	}


	public int getReopenCount() {
		return ReopenCount;
	}


	public void setReopenCount(int reopenCount) {
		ReopenCount = reopenCount;
	}


	public String getResolution() {
		return Resolution;
	}


	public void setResolution(String resolution) {
		Resolution = resolution;
	}


	public String getResolvedBy() {
		return ResolvedBy;
	}


	public void setResolvedBy(String resolvedBy) {
		ResolvedBy = resolvedBy;
	}


	public String getCurrentStatus() {
		return CurrentStatus;
	}


	public void setCurrentStatus(String currentStatus) {
		CurrentStatus = currentStatus;
	}


	@Override
	public String toString() {
		return "Ticket [ticket_id=" + ticket_id + ", ticket_name=" + ticket_name + ", ticket_number=" + ticket_number
				+ ", CreationDate=" + CreationDate + ", CreationBy=" + CreationBy + ", customer=" + customer
				+ ", CreatedBy=" + CreatedBy + ", Source=" + Source + ", Title=" + Title + ", TicketType=" + TicketType
				+ ", TicketPiority=" + TicketPiority + ", ReopenCount=" + ReopenCount + ", Resolution=" + Resolution
				+ ", ResolvedBy=" + ResolvedBy + ", CurrentStatus=" + CurrentStatus + "]";
	}
	
	
	
	
	
}
