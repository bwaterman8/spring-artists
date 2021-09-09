package com.artistcomplete.springartists.Repos;

import com.artistcomplete.springartists.Models.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
