package com.etiya.customerservice.controller;

import com.etiya.customerservice.dto.individualCustomer.*;
import com.etiya.customerservice.service.abstracts.IndividualCustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/api/v1/customer/individualCustomers")
@RequiredArgsConstructor
public class IndividualCustomerController {

    private final IndividualCustomerService individualCustomerService;

    @GetMapping("/getAll")
    public List<GetAllIndividualCustomerResponse> getAll() {

        return individualCustomerService.getAll();
    }

    @GetMapping("/{getById}")
    public ResponseEntity<GetByIdIndividualCustomerResponse> getById(@PathVariable("getById") UUID id) {
        if (individualCustomerService.getById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(individualCustomerService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<CreateIndividualCustomerResponse> add(@RequestBody @Valid CreateIndividualCustomerRequest request){
        CreateIndividualCustomerResponse saved= individualCustomerService.create(request);
        if(saved != null){
            return  new ResponseEntity<>(saved,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/delete")
    public DeleteIndividualCustomerResponse delete(@RequestParam UUID id){
        return individualCustomerService.delete(id);
    }

    @PutMapping("/update")
    public UpdateIndividualCustomerResponse update(@RequestBody @Valid UpdateIndividualCustomerRequest request){
        return individualCustomerService.update(request);
    }

}
