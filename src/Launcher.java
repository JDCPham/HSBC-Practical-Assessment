import java.util.ArrayList;


public class Launcher {
	
	
	public static void main(String[] args) {
		
		// Create Note Store.
		NoteStore noteStore = new NoteStore();
		
		// Add Text Notes to Note Store.
		noteStore.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems.");
		noteStore.storeNote("Few books to read - Ikigai, How to win friends and influence people.");
		
		// Add Text With Image Notes to Note Store.
		noteStore.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		noteStore.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		
		// Display notes.
		displayTextNotes(noteStore);
		displayTextAndImageNotes(noteStore);

	}
	
	
	public static void displayTextNotes(NoteStore noteStore) {
		
		// Counter to display note number.
		int noteCounter = 1;
		
		// Retrieve Text Notes from Store.
		ArrayList<TextNote> notes = noteStore.getAllTextNotes();
				
		// Loop over TextNotes and print contents.
		for (TextNote note: notes) {
			System.out.println("Text Note " + noteCounter +": " + note.getMessage());
			noteCounter++;
		}
	}
	
	
	public static void displayTextAndImageNotes(NoteStore noteStore) {
		
		// Counter to display note number.
		int noteCounter = 1;
		
		// Retrieve Text Notes from Store.
		ArrayList<TextAndImageNote> notes = noteStore.getAllTextAndImageNotes();
		
		// Loop over TextNotes and print contents.
		for (TextAndImageNote note: notes) {
			System.out.println("Text and Image Note " + noteCounter +": " + note.getMessage() + ", " + note.getImage());
			noteCounter++;
		}
	}

}
