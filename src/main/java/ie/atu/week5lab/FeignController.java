package ie.atu.week5lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    private final FeignService feignService;

    public FeignController(FeignService feignService) {
        this.feignService = feignService;
    }

    @GetMapping("/feign")
    public TodoResponse getFeignData() {
        return feignService.fetchData();
    }
}
