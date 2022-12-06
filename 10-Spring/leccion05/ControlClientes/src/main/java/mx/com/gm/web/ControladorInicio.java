package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import mx.com.gm.servicio.PersonaService;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaService.listarPerssonas();
       
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model) {
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    //@GetMapping("/eliminar/{idPersona}")
    @GetMapping("/eliminar")
    public String eliminar(Persona persona) {
        personaService.eliminar(persona);
        return "redirect:/";
    }
}
