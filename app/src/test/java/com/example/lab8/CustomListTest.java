package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),1);
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        int listSize = list.getCount();
        list.deleteCity(0);
        assertEquals(list.getCount(),listSize - 1);
    }

    @Test
    public void countCityTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Regina", "SK"));
        list.addCity(new City("Saskatoon", "SK"));
        list.addCity(new City("Moose Jaw", "SK"));
        assertEquals(list.getCount(),4);
    }
}
