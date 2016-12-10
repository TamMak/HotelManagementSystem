package edu.cs.mum.hotelmanagement.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reservation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
//  private String reservationNumber;   
//  
//  //@Temporal(TemporalType.DATE)
//  private Date checkInDate;
//  
//  //@Temporal(TemporalType.DATE)
//  private Date checkOutDate;
//  
// // @Temporal(TemporalType.DATE)  
//  private  Date  reservationDate;
//  
//  private  String remark;
//  
////  @ManyToOne(fetch = FetchType.EAGER)//no cascadint for ManyToOne & fetch has to be eager
//  private Guest customer;
//  //List<Hotel> hotels;
//  
// // @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//  private List<Room> rooms;
//  
// // @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//  private Payment payment;
//  
//  //handle later annotation
//  private ReservationState state;
//  
//	public Reservation() {
//	
//    }  
//
//	public Reservation(String reservationNumber, Date checkInDate, Date checkOutDate, Date reservationDate,
//			String remark, Guest customer) {
//		super();
//		this.reservationNumber = reservationNumber;
//		this.checkInDate = checkInDate;
//		this.checkOutDate = checkOutDate;
//		this.reservationDate = reservationDate;
//		this.remark = remark;
//		this.customer = customer;
//	}
//
//	//amnot sure do i need this or not
//	public void addRooms(Room room) {
//		this.rooms.add(room);
//	}
//
//	public List<Room> getRooms() {
//		return java.util.Collections.unmodifiableList(rooms);
//	}
//	
//
//	public String getReservationNumber() {
//		return reservationNumber;
//	}
//	public void setReservationNumber(String reservationNumber) {
//		this.reservationNumber = reservationNumber;
//	}
//	public Date getCheckInDate() {
//		return checkInDate;
//	}
//	public void setCheckInDate(Date checkInDate) {
//		this.checkInDate = checkInDate;
//	}
//	public Date getCheckOutDate() {
//		return checkOutDate;
//	}
//	public void setCheckOutDate(Date checkOutDate) {
//		this.checkOutDate = checkOutDate;
//	}
//	public Date getReservationDate() {
//		return reservationDate;
//	}
//	public void setReservationDate(Date reservationDate) {
//		this.reservationDate = reservationDate;
//	}
//	public String getRemark() {
//		return remark;
//	}
//	public void setRemark(String remark) {
//		this.remark = remark;
//	}
//	public Guest getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Guest customer) {
//		this.customer = customer;
//	}
//	
//	public Payment getPayment() {
//		return payment;
//	}
//	public void setPayment(Payment payment) {
//		this.payment = payment;
//	}
//	public ReservationState getState() {
//		return state;
//	}
//	public void setState(ReservationState state) {
//		this.state = state;
//	}
  
}
