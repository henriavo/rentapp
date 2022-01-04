package com.chicago.rentapp;

import com.chicago.rentapp.db.LandlordRepository;
import com.chicago.rentapp.db.ResidentRepository;
import com.chicago.rentapp.entity.Landlord;
import com.chicago.rentapp.entity.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {

    @Autowired
    private ResidentRepository residentRepository;

    @Autowired
    private LandlordRepository landlordRepository;

    @PostMapping(path="/add") //Map ONLY POST requests
    public @ResponseBody
    String addNewResident (@RequestParam String firstName, @RequestParam String lastName,@RequestParam String email,
                           @RequestParam String mobilePhone ){

//        Resident newGuy = new Resident("Demar", "DeRozan", "kingofthefourt@buckets.com", "312-555-1234");
//        residentRepository.save(newGuy);

        Landlord newLand = new Landlord("Lebron", "James", "ohiokid@nba.com", "312-555-1234");
        landlordRepository.save(newLand);

        return "your new guy saved! \n";

    }

    @GetMapping(path="/allResidents")
    public @ResponseBody Iterable<Resident> getAllResidents(){
        return residentRepository.findAll();
    }



    @GetMapping(path="/allLandlords")
    public @ResponseBody Iterable<Landlord> getAllLandlords(){
        return landlordRepository.findAll();
    }

}