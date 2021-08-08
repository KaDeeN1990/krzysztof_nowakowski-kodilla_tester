package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> name = new HashMap<>();
        Principal chris = new Principal("Chris", "Smith");
        Principal tom = new Principal("Tom", "McAllister");
        Principal barry = new Principal("Barry", "Greenstein");

        School chrisSchool = new School( 30);
        School tomSchool = new School( 90);
        School barrySchool = new School( 20);

        name.put(chris, chrisSchool);
        name.put(tom, tomSchool);
        name.put(barry, barrySchool);

        for (Map.Entry<Principal, School> principalSchoolEntry : name.entrySet())
            System.out.println(principalSchoolEntry.getKey().getFirstName() + " Liczba uczniów " + principalSchoolEntry.getValue().getStudentList());

    }
}
