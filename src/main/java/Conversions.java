import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conversions {

    @RequestMapping(method = RequestMethod.GET, path = "/ktoc/{kelvin}")
    public double KelvinToCelsius(@PathVariable double kelvin){
        double celsius = kelvin - 273.15;
        return celsius;
    }

}
