package Model;

public class Polygon {

	String Description;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Polygon [Description=" + Description + "]";
	}

	public Polygon(String description) {
		Description = description;
	}

}
