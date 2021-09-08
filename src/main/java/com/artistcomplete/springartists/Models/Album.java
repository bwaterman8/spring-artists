package com.artistcomplete.springartists.Models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
// mapped by is the change
    @OneToMany(mappedBy = "album")
    private Set<Song> songs = new HashSet<>();

//    @ManyToMany
//    @JoinTable(name = "artist_book", joinColumns = @JoinColumn(name = "album_id"),
//            inverseJoinColumns = @JoinColumn(name = "artist_id"))
//    private Set<Artist> artists = new HashSet<>();
    @ManyToOne
    private Artist artist;

    public Album() {
    }

    public Album(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    //    public Set<Artist> getArtists() {
//        return artists;
//    }
//
//    public void setArtists(Set<Artist> artists) {
//        this.artists = artists;
//    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(id, album.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
