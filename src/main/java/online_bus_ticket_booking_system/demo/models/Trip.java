package online_bus_ticket_booking_system.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="trips")
public class Trip {
    private Long id;
    @ManyToOne
    @JoinColumn(name="route_id")
    private Route route;
    @ManyToOne
    @JoinColumn(name="bus_id")
    private Bus bus;
    @Column(name="departure_at")
    private Instant departureAt;
    @Column(name="arrival_at")
    private Instant arrivalAt;
    @Column(name="departure_date")
    private Date deparatureDate;
}
