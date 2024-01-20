package com.hibernate_project.controller;

import com.hibernate_project.config.HibernateUtils;
import com.hibernate_project.repository.HotelRepository;
import com.hibernate_project.service.HotelService;

import java.util.Scanner;

public class HotelManagementSystem {

    private static Scanner input = new Scanner(System.in);

    public static void displayHotelManagementSystem(){
        HotelRepository hotelRepository = new HotelRepository();
        HotelService hotelService = new HotelService(hotelRepository);
        boolean exit = false;

        while(!exit){
            System.out.println("=========== Hotel Management System ===========");
            System.out.println("1. Hotel Operations");
            System.out.println("2. Room Operations");
            System.out.println("3. Guest Operations");
            System.out.println("4. Reservation Operations");
            System.out.println("0. Exit");
            System.out.println("===============================================");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    HotelController.displayHotelOperations();
                    break;
                case 2:
                    RoomController.displayRoomOperations();
                    break;
                case 3:
                    GuestController.displayGuestOperations();
                    break;
                case 4:
                    ReservationController.displayReservationOperations();
                    break;
                case 0:
                    exit = true;
                    HibernateUtils.shutdown();

                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }
    }
}
