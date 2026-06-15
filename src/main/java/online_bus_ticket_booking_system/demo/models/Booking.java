package online_bus_ticket_booking_system.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="reference_id")
    private String referenceId;
    @Column(name="total_price")
    private BigDecimal totalPrice;
    @Column(name="seat_count")
    private int seatCount;
    @Column(name="booked_at")
    private Instant bookedAt;
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @ManyToOne
    @JoinColumn(name="passenger_id")
    private Passenger passenger;
    @ManyToOne
    @JoinColumn(name="trip_id")
    private Trip trip;
    @ManyToOne
    @JoinColumn(name="payment_id")
    private Payment payment;
    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<BookingSeat> seats;
}
