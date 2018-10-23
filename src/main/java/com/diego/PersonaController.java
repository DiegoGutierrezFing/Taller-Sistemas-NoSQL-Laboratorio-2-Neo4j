package com.diego;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.diego.model.Comenta;
import com.diego.model.Persona;
import com.diego.repositorios.ComentaRepository;
import com.diego.repositorios.PersonaRepository;

@RestController
public class PersonaController {

    @Autowired
    ComentaRepository comentaRepository;

    @Autowired
    PersonaRepository personaRepository;

    @RequestMapping(value = "/personaComentario", method = RequestMethod.POST)
    public Comenta createPersonaComentarioRelationship(@RequestBody Comenta comenta) {
        comentaRepository.save(comenta);
        return comenta;

    }

    @RequestMapping(value = "/crearPersona", method = RequestMethod.POST)
    public Persona createPersona(@RequestBody Persona persona) {
        personaRepository.save(persona);
        return persona;

    }
}
