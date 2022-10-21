package JavaKampiOdev3Hafta3.entities;

public class Instructor extends BaseEntities {
	private String lastName;

	

	public Instructor(int id, String name, String lastName) {
		super(id, name);
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

}
