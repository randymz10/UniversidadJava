package mx.com.gm.web;

import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import mx.com.gm.dao.PersonaDao;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaDao personaDao;

    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaDao.findAll();
       
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
