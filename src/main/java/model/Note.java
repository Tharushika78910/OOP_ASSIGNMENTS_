package model;

public class Note {
    private String title;
    private String content;

    // Constructor
    public Note(String title, String content) {
        this.title = title == null ? "" : title;
        this.content = content == null ? "" : content;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title == null ? "" : title;
    }

    public void setContent(String content) {
        this.content = content == null ? "" : content;
    }

    @Override
    public String toString() {
        if (title.isBlank()) {
            return content;
        }
        return title + ": " + content;
    }
}
