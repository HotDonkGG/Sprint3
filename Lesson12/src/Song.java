import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Song song = (Song)obj;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && Objects.equals(songwriter, song.songwriter);
    }




       /* Song song = new Song(title, artist, songwriter);
        if (this == obj) return true;
        if (obj == null) return false;
        if (title.equals(song.title)) return true;
        if (artist.equals(song.artist)) return true;
        if (songwriter.equals(song.songwriter)) return true;
        return super.equals(obj); */


    // переопределите метод equals(Object)
    //...

}