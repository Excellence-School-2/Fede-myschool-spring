package it.nttdata.myschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import it.nttdata.myschool.repository.ClassRepository;

@Controller
public class SchoolClassController {

    private ClassRepository classRepository;

    SchoolClassController(ClassRepository classRepository){
        this.classRepository=classRepository;
    }

    @GetMapping("/classes")
    public String getScholClasses(Model model){
        model.addAttribute("schoolClasses", classRepository.findAll());
        return "schoolclass";  //ritorna una stringa con il nome della pagina html in templates

    }
    
    
}
