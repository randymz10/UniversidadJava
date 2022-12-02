package mx.com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "Hola mundo con Thymeleaf";

        var persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Perez");
        persona1.setEmail("jperez@mail.com");
        persona1.setTelefono("55442233");

        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kgomez@mail.com");
        persona2.setTelefono("55366883");

        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);
//        var personas = Arrays.asList(persona1, persona2);
        
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
//        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
