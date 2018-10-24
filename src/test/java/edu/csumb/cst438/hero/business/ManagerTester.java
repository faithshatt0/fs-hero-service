package edu.csumb.cst438.hero.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.when;

import edu.csumb.cst438.hero.data.HeroData;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerTester {

    @Autowired
    Manager manager; 

    @MockBean
    HeroData heroDb;

    // tests should have descriptive names
    // no business logic (ifs, loops, etc)
    
    @Test
    public void getHeroListReturnsEmptyListWhenNullHeroesInDb () {
        when(heroDb.getHeroData()).thenReturn(null);
        Assert.assertEquals(null, manager.getHeroes());
    }

    //Right: manager returns expected results

    //Boundary Test - Error: exception bubbles up

    //Boundary Test - Error: database connection failure

    //Boundary Test - Existence: what ahppens if there are no heroes?

    //Performance Test: obtain list of 1000 in less than 2 seconds

    //Boundary Test - Conformance: what if hero has no alter ego?
}