package JavaKampiOdev3Hafta3.entities;

public class Course extends BaseEntities{
	private Double coursePrice;

	

	public Course(int id, String name, Double coursePrice) {
		super(id, name);
		this.coursePrice = coursePrice;
	}

	public Double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(Double coursePrice) {
		this.coursePrice = coursePrice;
	}
	

}
