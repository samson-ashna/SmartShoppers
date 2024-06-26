package CSVFiles;

public class Admin {
	public String name;
	public int id;
	public String email;
	public String password;
	
	public Admin(String name, int id, String email, String password) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
	public Admin(){
		super();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
}

