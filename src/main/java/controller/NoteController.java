package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Note;
import model.Notebook;

public class NoteController {

    @FXML private TextField titleField;     // bound to fx:id="titleField"
    @FXML private TextArea contentArea;     // bound to fx:id="contentArea"
    @FXML private TextArea notesDisplay;    // bound to fx:id="notesDisplay"

    private Notebook notebook;

    // Called automatically after FXML is loaded
    @FXML
    public void initialize() {
        notebook = new Notebook();
        notesDisplay.setEditable(false); // prevent user from editing the display
    }

    // Called when the Add button is clicked
    @FXML
    private void handleAddNote() {
        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        // Ignore empty input
        if (title.isBlank() && content.isBlank()) {
            return;
        }

        // Create a Note and add it to the Notebook
        Note newNote = new Note(title, content);
        notebook.addNote(newNote);

        // Update the notes display
        notesDisplay.setText(notebook.allNotesAsText());

        // Clear inputs for next note
        titleField.clear();
        contentArea.clear();
    }
}
