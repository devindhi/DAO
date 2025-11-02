package com.teamcodelop.lms.dao.mapper;


import com.teamcodelop.lms.dao.dto.TodoDTO;
import com.teamcodelop.lms.dao.entity.Todo;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TodoMapper {

    TodoDTO toDTO(Todo todo);

    Todo toEntity(TodoDTO todoDTO);

    List<TodoDTO> toDTOList(List<Todo> todos);

    List<Todo> toEntityList(List<TodoDTO> todoDTOs);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void updateEntityFromDTO(TodoDTO todoDTO, @MappingTarget Todo todo);
}
