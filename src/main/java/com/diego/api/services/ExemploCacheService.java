package com.diego.api.services;

import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ExemploCacheService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ExemploCacheService.class);

    @Cacheable("exemploCache")
    public String exemploCache(){
        log.info("###Executando o serviço...");
        return "Teste de exemplo de cache.";
    }

}
