package com.hotelreservationsystem;


    public class Hotel {
        String HotelName;
        int Rates;

        public Hotel(String hotelName, int rates) {
            this.HotelName = hotelName;
            this.Rates = rates;

            System.out.println("HotelName :" +this.HotelName);
            System.out.println("Rates :" +this.Rates);
        }

        public String getHotelName() {
            return HotelName;
        }

        public void setHotelName(String hotelName) {
            HotelName = hotelName;
        }

        public int getRates() {
            return Rates;
        }

        public void setRates(int rates) {
            Rates = rates;
        }


    }

