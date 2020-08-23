package br.com.agibank.redisexample.api;

import br.com.agibank.redisexample.model.Coffee;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/coffees")
public class CoffeeApi {
    private final ReactiveRedisOperations<String, Coffee> coffeeOps;

    CoffeeApi(ReactiveRedisOperations<String, Coffee> coffeeOps) {
        this.coffeeOps = coffeeOps;
    }

    @GetMapping
    public Flux<Coffee> all() {
        return coffeeOps.keys("*")
                .flatMap(coffeeOps.opsForValue()::get);
    }
}
