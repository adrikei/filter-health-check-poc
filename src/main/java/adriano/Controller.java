package adriano;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/echo")
    public ResponseEntity<String> echo(@RequestParam("text") String text){
        return ResponseEntity.ok(text);
    }

    @RequestMapping("/err")
    public ResponseEntity<String> error(@RequestParam("text") String text){
        return ResponseEntity.internalServerError().body(text);
    }
}
