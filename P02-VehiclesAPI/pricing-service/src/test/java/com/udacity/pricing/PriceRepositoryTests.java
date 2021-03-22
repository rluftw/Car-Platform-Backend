package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.domain.price.PriceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PriceRepositoryTests {
    @Autowired
    PriceRepository priceRepository;

    @Test
    public void givenPriceJsonPopulatorThenShouldInsertPriceOnStart() {
        List<Price> fruits = priceRepository.findAll();
        assertEquals(5, fruits.size());
    }
}
