package com.hibernate_project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="t_hotel")
public class Hotel {

    @Id
    private Long id;
@Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String location;

    private List<Room> rooms = new ArrayList<>();

    public Hotel(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.location = address;
    }

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + location + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
