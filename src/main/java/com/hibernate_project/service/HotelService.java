package com.hibernate_project.service;

import com.hibernate_project.domain.Hotel;
import com.hibernate_project.repository.HotelRepository;

import java.util.Scanner;

public class HotelService {

    private Scanner input = new Scanner(System.in);
    private final HotelRepository hotelRepository ;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void savHotel() {

        Hotel hotel = new Hotel();
        System.out.println("Enter hotel id: ");
        hotel.setId(input.nextLong());
        System.out.println("Enter hotel name: ");
        hotel.setName(input.nextLine());
        System.out.println("Enter hotel location: ");
        hotel.setLocation(input.nextLine());

        hotelRepository.save(hotel);
        System.out.println("Hotel saved successfully! Hotel ID is : " + hotel.getId());



    }
}
