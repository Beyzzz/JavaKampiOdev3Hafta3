package JavaKampiOdev3Hafta3.entities;

public class Category extends BaseEntities{
   private String description;



public Category(int id, String name, String description) {
	super(id, name);
	this.description = description;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
   
}
