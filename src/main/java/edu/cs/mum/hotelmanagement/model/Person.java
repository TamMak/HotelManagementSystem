package edu.cs.mum.hotelmanagement.model;

@Enity
public abstract class Person {
<<<<<<< HEAD
	   @Id
	   @GeneratedValue(strategy = GenerationType.Auto)
	   @Column(name = "id", nullable = false, updatable = false)
	   private Long id;
	   private String firstName;
	   private String lastName;

	   @Column(name = "email", nullable = false, unique = true)
	   private String email;
	   private String phoneNumber;
	   private String password;
	   @Enumerated(EnumType.STRING)
	   private Role role;

	   Person(String firstName, String lastName, String email, String phoneNumber,String password){
		   this.firstName = firstName;
		   this.lastName = lastName;
		   this.email = email;
		   this.phoneNumber = phoneNumber;
		   this.password = password;
	   }

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


=======
	
	   Long id;
	   String firstName;
	   String lastName;
	   String email;
	   String phoneNumber;
	   String userName;
	   String password;   
>>>>>>> 60ae5fa97abc48a5abb434151c1b367097139147

}
