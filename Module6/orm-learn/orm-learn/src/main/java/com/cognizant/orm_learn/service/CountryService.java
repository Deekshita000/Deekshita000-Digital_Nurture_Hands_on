package com.cognizant.orm_learn.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> findCountriesByPartialName(String name) {
        return countryRepository.findByNameContaining(name);
    }

    @Transactional
    public List<Country> getCountriesContainingAndSorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    @Transactional
    public List<Country> getCountriesStartingWith(String alphabet) {
        return countryRepository.findByNameStartingWith(alphabet);
    }
}