package online_bus_ticket_booking_system.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(
        name="booking_seats",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames={
                                "booking_id",
                                "bus_seat_id"
                        }
                )
        }
)
public class BookingSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name="booking_id")
    private Booking booking;
    @ManyToOne
    @JoinColumn(name="bus_seat_id")
    private BusSeat busSeat;
}
