package com.in28minutes.rest.webservices.restfulwebservices.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Size(min = 2, message = "Name should have at least two characters")
    private String name;
    @Past(message = "Date should be in past")
    private Date birthDate;
    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
