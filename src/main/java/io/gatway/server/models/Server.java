package io.gatway.server.models;

import io.gatway.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Server {
   @Id
   @GeneratedValue(strategy = AUTO)
    private Long id;
   @Column(unique = true)
   @NotEmpty(message ="IP address cannot be empty or null")
    private String ipAddress;
    private String name;
    private String memory ;
    private String imgUrl;
    private Status status;

    public void setImageUrl(String setServerImageUrl) {
    }
}
