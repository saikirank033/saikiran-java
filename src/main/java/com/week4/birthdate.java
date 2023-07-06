package com.week4;



import java.time.LocalDate;
import java.util.List;

    public class birthdate {
        public static void main(String[] args) {
            // Example usage
            List<LocalDate> dates = List.of(
                    LocalDate.of(2023, 6, 15),
                    LocalDate.of(2021, 8, 10),
                    LocalDate.of(2015, 6, 20)
            );

            LocalDate earliestDate = dates.stream()
                    .min(LocalDate::compareTo)
                    .orElse(null);
            LocalDate latestDate = dates.stream()
                    .max(LocalDate::compareTo)
                    .orElse(null);

            System.out.println("Earliest date: " + earliestDate);
            System.out.println("Latest date: " + latestDate);
        }
    }


