package adriano;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    private final HealthCheckService healthCheckService;

    public Aspect(HealthCheckService healthCheckService){
        this.healthCheckService = healthCheckService;
    }

    @Around("execution(* adriano.Controller.*(..))")
/*
//    @Pointcut("execution(* adriano.Controller.*(..))")
//    public void controller(){}

//    @Around(value = "controller()")
*/
    public Object call(ProceedingJoinPoint jp) throws Throwable{
        ResponseEntity<Object> proceeded = (ResponseEntity<Object>) jp.proceed();
        HealthCheckService.Health health = healthCheckService.getHealth();
        Object body = Map.of("payload", proceeded.getBody(), "health", health);
        return ResponseEntity.status(proceeded.getStatusCode()).body(body);
    }
}
