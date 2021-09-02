package com.artistcomplete.springartists.Repos;

import com.artistcomplete.springartists.Models.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
