package com.jihun.todolist.web.dto.todo;

import com.jihun.todolist.domain.todo.Todo;

import lombok.Data;

@Data
public class UpdateTodoReqDto {
	private int todoCode;
	private String todo;
	
	public Todo toEntity() {
		return Todo.builder()
				.todo_code(todoCode)
				.todo_content(todo)
				.build();
	}
}
