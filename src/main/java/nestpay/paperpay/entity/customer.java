package nestpay.paperpay.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="customer_r")
public class customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="h_id")
	private int hId;
	@Column(name="line_id")
	private int lineId;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="password")
	private String password;
	@Column(name="details")
	private String details;
	@Column(name="addational_charges")
	private int addationalCharges;
	@Column(name="total_amount")
	private int totalAmount;
	@Column(name="is_paid")
	private int cusomerIsPaid;
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDate createdDate;
	@Column(name="is_active")
	private int isActive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int gethId() {
		return hId;
	}
	public void sethId(int hId) {
		this.hId = hId;
	}
	public int getLineId() {
		return lineId;
	}
	public void setLineId(int lineId) {
		this.lineId = lineId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getAddationalCharges() {
		return addationalCharges;
	}
	public void setAddationalCharges(int addationalCharges) {
		this.addationalCharges = addationalCharges;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getCusomerIsPaid() {
		return cusomerIsPaid;
	}
	public void setCusomerIsPaid(int cusomerIsPaid) {
		this.cusomerIsPaid = cusomerIsPaid;
	}
	public LocalDate getCreated_date() {
		return createdDate;
	}
	public void setCreated_date(LocalDate createdDate) {
		createdDate = createdDate;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", hId=" + hId + ", lineId=" + lineId + ", mobileNumber=" + mobileNumber
				+ ", password=" + password + ", details=" + details + ", addationalCharges=" + addationalCharges
				+ ", totalAmount=" + totalAmount + ", cusomerIsPaid=" + cusomerIsPaid + ", Created_date=" + createdDate
				+ ", isActive=" + isActive + "]";
	}
	
}
