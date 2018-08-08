package com.project.starwars.toptrumpsMVC.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.project.starwars.toptrumpsMVC.model.Card;

import java.io.File;
import java.io.IOException;
import java.util.Stack;

public class JsontoPojoConvert {

    public Stack readCardsFromJson()
            throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Stack cardObjects = mapper.readValue(new File("StarWarsTopTrumpsData.json"),
                TypeFactory.defaultInstance().constructCollectionType(Stack.class, Card.class));


        return cardObjects;



    }





}
