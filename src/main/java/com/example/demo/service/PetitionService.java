package com.example.demo.service;

import com.example.demo.model.Petition;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetitionService {
    private List<Petition> petitions;

    public PetitionService() {
        this.petitions = new ArrayList<>();
        // Add some sample petitions
        petitions.add(new Petition(1, "Save the Rainforest", "We must act now to protect the Amazon!"));
        petitions.add(new Petition(2, "Ban Single-Use Plastics", "Reduce pollution by banning plastics."));
    }

    public List<Petition> getAllPetitions() {
        return petitions;
    }

    public Petition getPetitionById(int id) {
        return petitions.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void addPetition(Petition petition) {
        petitions.add(petition);
    }
}