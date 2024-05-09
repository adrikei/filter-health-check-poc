package adriano;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HealthCheckService {

    public enum Health {
        OK,
        FALLBACK_MODE,
        FAILING
    }

    private final Random random = new Random();

    public Health getHealth(){

        int index = this.random.nextInt(0, Health.values().length);
        return Health.values()[index];
    }
}
