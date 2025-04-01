package servicesLayer;
import org.springframework.stereotype.Service;

import models.Place;
import repositoryLayer.PlaceRepository;

import java.util.List;

@Service
public class PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

   
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }

   
    public Place createPlace(Place place) {
        return placeRepository.save(place);
    }
}

