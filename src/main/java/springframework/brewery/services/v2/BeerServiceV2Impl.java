package springframework.brewery.services.v2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springframework.brewery.web.model.v2.BeerDtoV2;
import springframework.brewery.web.model.v2.BeerStyleEnum;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
            .beerName("Galaxy Cat")
            .beerStyle(BeerStyleEnum.LAGER)
            .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
//        todo impl - would add a real impl to update beer
        log.debug("Updating a beer...");
    }

    @Override
    public void deleteById(UUID beerId) {
//        todo impl - would delete a real impl to delete beer
        log.debug("Deleting a beer...");
    }
}
