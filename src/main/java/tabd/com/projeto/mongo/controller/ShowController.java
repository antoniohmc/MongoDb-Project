package tabd.com.projeto.mongo.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tabd.com.projeto.mongo.model.Show;
import tabd.com.projeto.mongo.repository.ShowRepository;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private final ShowRepository showRepository;

    @PostMapping("/addShow")
    public Show addShow(
            @RequestParam Integer showId,
            @RequestParam String location,
            @RequestParam String date,
            @RequestParam String avaliableTickets) {

        Show show = new Show(showId, location, date, avaliableTickets);

        return showRepository.save(show);
    }

    @GetMapping("/returnShow")
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}
