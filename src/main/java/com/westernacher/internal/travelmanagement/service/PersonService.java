package com.westernacher.internal.travelmanagement.service;

import com.westernacher.internal.travelmanagement.domain.Person;
import com.westernacher.internal.travelmanagement.domain.Role;
import com.westernacher.internal.travelmanagement.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

}
