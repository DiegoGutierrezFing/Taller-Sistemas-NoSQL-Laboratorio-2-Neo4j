package com.diego;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.diego.model.Persona;
import com.diego.model.Comenta;
import com.diego.model.Comentario;

@Configuration
public class Neo4JRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration  {
	@Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Persona.class);
        config.exposeIdsFor(Comentario.class);
        config.exposeIdsFor(Comenta.class);
    }
}
