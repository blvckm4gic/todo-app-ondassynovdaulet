package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Map<String, Object>> getTasks() {
        return List.of(
            Map.of("id", 1, "title", "Buy milk", "done", false),
            Map.of("id", 2, "title", "Write report", "done", true)
        );
    }
}
