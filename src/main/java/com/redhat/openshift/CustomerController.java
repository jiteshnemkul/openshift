package com.redhat.openshift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @RequestMapping("/")
    public List<Customer> findAll()
    {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(1, "jitesh"));
        customerList.add(new Customer(2, "bishal"));
        return customerList;
    }

    @RequestMapping("/movies")
    public List<Movies> findmovies(){
        List<Movies> movielist=new ArrayList<>();
        movielist.add(new Movies(1,"KGF2"));
        movielist.add(new Movies(1,"Walking dead"));
return  movielist;
    }
}
