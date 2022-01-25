/*
@author : Nayan Tripathi
@Date : 25/01/2022
Workshop Program : Hotel Reservation System
 */


package com.hotelreservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String args[]) {
        System.out.println("Welcome to Hotel Reservation System"); //Welcome message

    }

    public Boolean AddHotel(String HotelName, int Rates) {

        ArrayList<Hotel> AddHotel = new ArrayList<>();
        Hotel obj1 = new Hotel(HotelName,Rates);
        if (HotelName == "LakeWood") {
            AddHotel.add(obj1);
            System.out.println("Hotel is added successfully!");
            return true;
        }
        else
            return false;

    }
}
