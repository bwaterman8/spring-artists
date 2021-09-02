package com.artistcomplete.springartists.BootStrap;

import com.artistcomplete.springartists.Models.Album;
import com.artistcomplete.springartists.Models.Artist;
import com.artistcomplete.springartists.Models.Song;
import com.artistcomplete.springartists.Repos.AlbumRepository;
import com.artistcomplete.springartists.Repos.ArtistRepository;
import com.artistcomplete.springartists.Repos.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final ArtistRepository artistRepository;
    private final AlbumRepository albumRepository;
    private final SongRepository songRepository;

    public BootStrapData(ArtistRepository artistRepository, AlbumRepository albumRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
        this.albumRepository = albumRepository;
        this.songRepository = songRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Artist kanye = new Artist("Kanye West", 43, "Chicago");

        Album donda = new Album("donda");
        Song dondaChant = new Song("donda", "2:09");
        Song jail = new Song("jail", "4:57");

        Album graduation = new Album("graduation");
        Song goodMorning = new Song("good morning", "3:15");
        Song stronger = new Song("stronger", "5:12");

        kanye.getAlbums().add(donda);
        kanye.getAlbums().add(graduation);

        donda.getArtists().add(kanye);
        donda.getSongs().add(dondaChant);
        donda.getSongs().add(jail);

        graduation.getArtists().add(kanye);
        graduation.getSongs().add(goodMorning);
        graduation.getSongs().add(stronger);

        artistRepository.save(kanye);
        albumRepository.save(donda);
        albumRepository.save(graduation);
        songRepository.save(dondaChant);
        songRepository.save(jail);
        songRepository.save(goodMorning);
        songRepository.save(stronger);

        Artist strokes = new Artist("the strokes", 12, "New York");

        Album room = new Album("room on fire");
        Song reptilla = new Song("reptilla", "3:35");
        Song control = new Song("under control", "3:02");

        Album isThis = new Album("is this it");
        Song someday = new Song("someday", "3:03");
        Song nite = new Song("last night", "3:13");

        strokes.getAlbums().add(room);
        strokes.getAlbums().add(isThis);

        room.getArtists().add(strokes);
        room.getSongs().add(reptilla);
        room.getSongs().add(control);

        reptilla.getAlbums().add(room);
        control.getAlbums().add(room);

        isThis.getArtists().add(strokes);
        isThis.getSongs().add(someday);
        isThis.getSongs().add(nite);

        someday.getAlbums().add(isThis);
        nite.getAlbums().add(isThis);

        artistRepository.save(strokes);
        albumRepository.save(room);
        albumRepository.save(isThis);
        songRepository.save(reptilla);
        songRepository.save(control);
        songRepository.save(someday);
        songRepository.save(nite);

        System.out.println("started in spring boot");
        System.out.println("number of artists: " + artistRepository.count());
        System.out.println("number of albums: " + albumRepository.count());
        System.out.println("number of songs: " + songRepository.count());
    }


}
