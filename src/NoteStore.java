import java.util.ArrayList;


public class NoteStore {
	
	
	/* Data Members: Two Arrays to Store two different types of Notes. */
	private ArrayList<TextNote> textNotes = new ArrayList<TextNote>();
	private ArrayList<TextAndImageNote> textAndImageNotes = new ArrayList<TextAndImageNote>();
	
	
	/* Method to store Text Note */
	public void storeNote(String message) {
		textNotes.add(new TextNote(message));
	}
	
	
	/* Method to store Text w/ Image Note */
	public void storeNote(String message, String image) {
		this.textAndImageNotes.add(new TextAndImageNote(message, image));	
	}
	
	
	/* Returns Text Notes */
	public ArrayList<TextNote> getAllTextNotes() {
			return this.textNotes;
	}
	
	
	/* Returns Text w/ Image Notes */
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
			return this.textAndImageNotes;
	}

	
}
