package com.chicago.rentapp;

import com.chicago.rentapp.db.LandlordRepository;
import com.chicago.rentapp.db.ResidentRepository;
import com.chicago.rentapp.entity.Landlord;
import com.chicago.rentapp.entity.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {

    @Autowired
    private ResidentRepository residentRepository;

    @Autowired
    private LandlordRepository landlordRepository;

    @PostMapping(path="/addResident")
    public @ResponseBody
    String addNewResident(@RequestParam String firstName, @RequestParam String lastName,@RequestParam String email,
                           @RequestParam String mobilePhone ){

        Resident newGuy = new Resident(firstName, lastName, email, mobilePhone);
        residentRepository.save(newGuy);

        return "new resident saved! \n";

    }

    @PostMapping(path="/addLandlord")
    public @ResponseBody
    String addNewLandlord(@RequestParam String firstName, @RequestParam String lastName,@RequestParam String email,
                           @RequestParam String mobilePhone ){

        Landlord newGuy = new Landlord(firstName, lastName, email, mobilePhone);
        landlordRepository.save(newGuy);

        return "new landlord saved! \n";

    }

    @PostMapping(path="updateResidentEmail")
    public @ResponseBody String updateResidentEmail(@RequestParam String recordId, @RequestParam String email){
        Integer id = Integer.parseInt(recordId);
        Optional<Resident> resident = residentRepository.findById(id);
        if(resident.isPresent()){
            Resident res = resident.get();
            res.setEmail(email);
            residentRepository.save(res);
            return "successful update! \n";
        }
        else{
            return null;
        }
    }

    @PostMapping(path="updateLandlordEmail")
    public @ResponseBody String updateLandlordEmail(@RequestParam String recordId, @RequestParam String email){
        Integer id = Integer.parseInt(recordId);
        Optional<Landlord> landlord = landlordRepository.findById(id);
        if(landlord.isPresent()){
            Landlord res = landlord.get();
            res.setEmail(email);
            landlordRepository.save(res);
            return "successful update! \n";
        }
        else{
            return null;
        }
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