package com.in28minutes.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;
    private String description;
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
}
