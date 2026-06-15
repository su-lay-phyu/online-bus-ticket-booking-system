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
@Table(name="payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    @Column(name="transaction_id")
    private String transactionId;
    @Enumerated(value = EnumType.STRING)
    @Column(name="payment_method")
    private PaymentMethod paymentMethod;
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @Column(name="paid_at")
    private Instant paidAt;
}
