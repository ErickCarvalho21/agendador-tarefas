package com.javanauta.agendador_tarefas.business.mapper;


import com.javanauta.agendador_tarefas.business.dto.TarefasDTO;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")

    TarefasEntity paraTarefasEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);


    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dto);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entities);





}
