package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Note;
import model.Notebook;

public class NoteController {

    @FXML private TextField titleField;
    @FXML private TextArea contentArea;
    @FXML private TextArea notesDisplay;

    private Notebook notebook;

    @FXML
    public void initialize() {
        notebook = new Notebook();
        notesDisplay.setEditable(false);
    }

    @FXML
    private void handleAddNote() {
        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (title.isBlank() && content.isBlank()) {
            // optional: show an Alert; here we just ignore empty notes
            return;
        }

        Note n = new Note(title, content);
        notebook.addNote(n);

        notesDisplay.setText(notebook.allNotesAsText());

        // clear inputs
        titleField.clear();
        contentArea.clear();
    }
}
