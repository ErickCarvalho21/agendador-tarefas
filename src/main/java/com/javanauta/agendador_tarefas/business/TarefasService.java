package com.javanauta.agendador_tarefas.business;

import com.javanauta.agendador_tarefas.business.dto.TarefasDTO;
import com.javanauta.agendador_tarefas.business.mapper.TarefasConverter;
import com.javanauta.agendador_tarefas.infrastructure.entity.TarefasEntity;
import com.javanauta.agendador_tarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.javanauta.agendador_tarefas.infrastructure.repository.TarefasRepository;
import com.javanauta.agendador_tarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PEDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefasEntity(dto);


        return tarefaConverter.gravarTarefaDTo(
                tarefasRepository.save(entity));
    }
}
