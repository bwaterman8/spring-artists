package com.artistcomplete.springartists.Contollers;

import com.artistcomplete.springartists.Repos.AlbumRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class AlbumController {
    private final AlbumRepository albumRepository;

    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public String getAllAlbums(Model model) {
        model.addAttribute("albums", albumRepository.findAll());

        return "albums";
    }
}
