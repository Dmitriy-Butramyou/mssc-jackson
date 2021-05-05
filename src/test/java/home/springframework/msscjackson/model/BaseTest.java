package home.springframework.msscjackson.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
  BeerDto getDto() {
    return BeerDto.builder()
        .beerName("BeerName")
        .beerStyle("Ale")
        .id(UUID.randomUUID())
        .createdDate(OffsetDateTime.now())
        .lastUpdatedDate(OffsetDateTime.now())
        .price(new BigDecimal("13.04"))
        .upc(1231231234L)
        .myLocalDate(LocalDate.now())
        .build();
  }
}
