package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.http.*
import static org.springframework.web.bind.annotation.RequestMethod.*

@RestController
class GreetingController {

    @Autowired
    PersonService personService;

    @RequestMapping(value="/person/greet", method = GET)
    String greet(String firstName) {
        def p = personService.findByFirstName(firstName)
        return p ? "Hello ${p.firstName}!" : "Person not found"
    }

    @RequestMapping(value = '/person/add', method = POST)
    ResponseEntity addPerson(String firstName, String lastName) {
        Person p = personService.addPerson(firstName, lastName)
        return new ResponseEntity(p ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST)
    }

}

