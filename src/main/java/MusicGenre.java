package main.java;

public enum MusicGenre {
    WHITE_GIRL_MUSIC("white girl music"),
    LATINO_POP("latino pop");

    MusicGenre(String incomingDescription) {
        description = incomingDescription;
    }

    private final String description;

    public String getDescription() {
        return description;
    }

}
