package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Notebook {
    private final List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return Collections.unmodifiableList(notes);
    }

    public String allNotesAsText() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Note n : notes) {
            sb.append(i++).append(". ");
            if (!n.getTitle().isBlank()) {
                sb.append(n.getTitle()).append("\n");
            }
            sb.append(n.getContent()).append("\n\n");
        }
        return sb.toString().trim();
    }
}
