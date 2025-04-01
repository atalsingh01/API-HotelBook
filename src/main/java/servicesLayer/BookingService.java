package servicesLayer;

import org.springframework.stereotype.Service;

import models.Booking;
import repositoryLayer.BookingRepository;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

   
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

  
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}
