package za.ac.cput.domain.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportManagementTest {

    //    public void test() {
//        Employee employee = new Employee.Builder().setEmployeeID("23456")
//                .setEmployeeName("Mr James, Patrick").setDepID("65432")
//                .setDepName("trolling").build();
//
//        System.out.println(employee);
    @Test
    public void test() {
        AirportManagement airportM = new AirportManagement.Builder().setAirportName("MayaMaya")
                .setCityName("Brazzaville").setArea("Center of Africa").build();

        System.out.println(airportM);
    }
}