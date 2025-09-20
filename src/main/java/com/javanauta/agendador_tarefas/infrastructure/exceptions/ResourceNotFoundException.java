package com.javanauta.agendador_tarefas.infrastructure.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String mensagem){
        super(mensagem);
    }

    public  ResourceNotFoundException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
