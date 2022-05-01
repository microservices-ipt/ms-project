
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RestController
public class FacadeController {
    WebClient loggingService = WebClient.create("http://localhost:8081");
    WebClient messageService = WebClient.create("http://localhost:8082");

    @GetMapping("/facade")
    public Mono<Void> clientWebClient(){
        return Mono.empty().then();
    }

    @PostMapping("/facade")
    public Mono<Void> facadeWebClient() {
        return Mono.empty().then();
    }

}
