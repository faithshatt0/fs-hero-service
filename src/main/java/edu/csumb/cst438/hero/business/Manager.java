package edu.csumb.cst438.hero.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.csumb.cst438.hero.business.entities.Hero;
import edu.csumb.cst438.hero.data.HeroData;

@Service
public class Manager {

    @Autowired
    HeroData heroDbClient;

    public List<Hero> getHeroes () {
        return null;
    }
}