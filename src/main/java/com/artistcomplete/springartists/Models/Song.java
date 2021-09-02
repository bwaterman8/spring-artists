package com.artistcomplete.springartists.Models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String length;

    @ManyToOne
    private Set<Album> albums = new HashSet<>();

    public Song() {
    }

    public Song(String title, String length) {
        this.title = title;
        this.length = length;
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

    public String getLength() {
        return length;
    }

    public void setLength(String  length) {
        this.length = length;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

}
