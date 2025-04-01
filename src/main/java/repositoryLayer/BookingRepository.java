package repositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

