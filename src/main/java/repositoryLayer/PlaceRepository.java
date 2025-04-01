package repositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
