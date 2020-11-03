public class TextAndImageNote extends TextNote {
	
	
	/* Data Fields */
	private String image;
	
	
	/* Constructor: Sets message and image */
	public TextAndImageNote(String message, String image) {
		super(message);
		this.image = image;
	}
	
	
	/* Getters */
	public String getImage() {
		return this.image;
	}
	
	
	/* Setters */
	public void setImage(String image) {
		this.image = image;
	}

}
