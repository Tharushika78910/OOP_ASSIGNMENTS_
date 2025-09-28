package model;

public class Note {
    private String title;
    private String content;

    public Note(String title, String content) {
        this.title = title == null ? "" : title;
        this.content = content == null ? "" : content;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    @Override
    public String toString() {
        if (title == null || title.isBlank()) return content;
        return title + "\n" + content;
    }
}
