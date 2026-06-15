package online_bus_ticket_booking_system.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="buses")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    @Column(name="total_no_of_seats")
    private int totalNoOfSeats;
    @Column(name="departs_at")
    private Instant departsAt;
    private Instant eta;
    @ManyToOne
    @JoinColumn(name="bus_operator_id")
    private BusOperator busOperator;
    @ManyToOne
    @JoinColumn(name="bus_type_id")
    private BusType busType;
}
