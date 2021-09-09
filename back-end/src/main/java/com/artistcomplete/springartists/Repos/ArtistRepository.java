package com.artistcomplete.springartists.Repos;

import com.artistcomplete.springartists.Models.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
