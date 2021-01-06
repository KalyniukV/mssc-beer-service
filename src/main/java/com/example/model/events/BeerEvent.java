package com.example.model.events;

import com.example.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 6778862444420929175L;

    private BeerDto beerDto;
}
