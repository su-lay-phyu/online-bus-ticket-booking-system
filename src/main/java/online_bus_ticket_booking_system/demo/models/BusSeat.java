package online_bus_ticket_booking_system.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="bus_seats")
public class BusSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="seat_no")
    private String seatNo;
    @Column(name="is_selected")
    private boolean isSelected;
    @ManyToOne
    @JoinColumn(name="bus_id")
    private Bus bus;
}
