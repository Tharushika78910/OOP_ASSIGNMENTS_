package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Notebook {
    private final List<Note> notes = new ArrayList<>();

    // Add a new note
    public void addNote(Note note) {
        if (note != null) {
            notes.add(note);
        }
    }

    // Retrieve all notes (read-only list)
    public List<Note> getNotes() {
        return Collections.unmodifiableList(notes);
    }

    // Return all notes as formatted text
    public String allNotesAsText() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Note note : notes) {
            sb.append(i++).append(". ").append(note.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
