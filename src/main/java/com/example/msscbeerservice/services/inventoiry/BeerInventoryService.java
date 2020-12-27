package com.example.msscbeerservice.services.inventoiry;


import java.util.UUID;

public interface BeerInventoryService {

    Integer getOnHandInventory(UUID beerId);

}
