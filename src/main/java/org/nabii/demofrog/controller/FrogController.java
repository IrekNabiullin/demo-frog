package org.nabii.demofrog.controller;

import lombok.RequiredArgsConstructor;
import org.nabii.demofrog.dto.FrogDto;
import org.nabii.demofrog.entity.Frog;
import org.nabii.demofrog.service.FrogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Frogs")
@RequiredArgsConstructor
public class FrogController {

    private final FrogService service;

    @PostMapping
    public Frog save(@RequestBody FrogDto Frog) {
        return service.save(Frog);
    }

    @GetMapping
    public Iterable<Frog> getAll() {
        return service.getAll();
    }
}
