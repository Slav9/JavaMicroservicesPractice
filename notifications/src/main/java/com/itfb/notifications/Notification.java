package com.itfb.notifications;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Notification {

    @Id
    @SequenceGenerator(
            name= "notifications_id_sequence",
            sequenceName = "notifications_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notifications_id_sequence"
    )
    private Long notificationId;
    private Long toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;
}
