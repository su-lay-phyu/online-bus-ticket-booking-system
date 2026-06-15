package online_bus_ticket_booking_system.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="booking_seats")
public class BookingSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="seat_no")
    private String seatNo;
    private double price;
    @ManyToOne
    @JoinColumn(name="booking_id")
    private Booking booking;
}
