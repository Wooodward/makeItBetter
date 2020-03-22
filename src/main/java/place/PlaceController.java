package place;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableMongoRepositories(basePackages = {"place"})
public class PlaceController {
    @Autowired
    private PlaceRepo placeRepo;

    @RequestMapping(value = "/place", method = RequestMethod.POST)
    public Place createPlace(@RequestBody Place place) {
        return placeRepo.save(place);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/place/{placeId}")
    public Place getPlace(@PathVariable String placeId) {
        return placeRepo.findById(placeId).get();
    }
}
