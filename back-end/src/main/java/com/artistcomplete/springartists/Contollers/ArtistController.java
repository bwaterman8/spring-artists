package com.artistcomplete.springartists.Contollers;

import com.artistcomplete.springartists.Models.Artist;
import com.artistcomplete.springartists.Repos.AlbumRepository;
import com.artistcomplete.springartists.Repos.ArtistRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
public class ArtistController {

    private final ArtistRepository artistRepository;
    private final AlbumRepository albumRepository;

    public ArtistController(ArtistRepository artistRepository, AlbumRepository albumRepository) {
        this.artistRepository = artistRepository;
        this.albumRepository = albumRepository;
    }

    @RequestMapping("/artists")
    public String getArtists(Model model) {

        model.addAttribute("artists", artistRepository.findAll());

        return "artists";
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable long id) {
        return artistRepository.findById(id).get();
    }

}
