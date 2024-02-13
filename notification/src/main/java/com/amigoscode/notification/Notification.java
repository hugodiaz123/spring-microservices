package com.amigoscode.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @SequenceGenerator(
            name = "notification_id_seq",
            sequenceName = "notification_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notification_id_seq"
    )
    private Integer id;
    private Integer toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;
}
