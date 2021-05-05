package home.springframework.msscjackson.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest {

  @Autowired
  ObjectMapper objectMapper;

  @Test
  void testSerializeDto() throws JsonProcessingException {
    BeerDto beerDto = getDto();
    String jsonString = objectMapper.writeValueAsString(beerDto);

    System.out.println(jsonString);
  }

  @Test
  void testDeserialize() throws JsonProcessingException {
    String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":1231231234,\"price\":\"13.04\",\"createdDate\":\"2021-05-05T13:52:30+0300\",\"lastUpdatedDate\":\"2021-05-05T13:52:30.0131668+03:00\",\"myLocalDate\":\"20210505\",\"beerId\":\"60df6738-0efe-4bb0-b4b9-946752e0f264\"}\n";
    BeerDto dto = objectMapper.readValue(json, BeerDto.class);

    System.out.println(dto);
  }

}