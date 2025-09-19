package com.javanauta.agendador_tarefas.business.mapper;


import com.javanauta.agendador_tarefas.business.dto.TarefasDTO;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefasEntity(TarefasDTO dto);

    TarefasDTO gravarTarefaDTo(TarefasEntity entity);



}
