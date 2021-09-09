package com.artistcomplete.springartists.Contollers;

import com.artistcomplete.springartists.Repos.AlbumRepository;
import com.artistcomplete.springartists.Repos.SongRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongController {

    private final SongRepository songRepository;
    private final AlbumRepository albumRepository;

    public SongController(SongRepository songRepository, AlbumRepository albumRepository) {
        this.songRepository = songRepository;
        this.albumRepository = albumRepository;
    }
    @RequestMapping("/songs")
    public String getSongs(Model model) {

        model.addAttribute("songs", songRepository.findAll());

        return "songs";
    }

}
