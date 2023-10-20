package org.nabii.demofrog.service;

import lombok.RequiredArgsConstructor;
import org.nabii.demofrog.dto.FrogDto;
import org.nabii.demofrog.entity.Frog;
import org.nabii.demofrog.repository.FrogRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FrogService {

    private final FrogRepository FrogRepository;

    public Frog save(FrogDto FrogDto) {
        Frog Frog = new Frog()
                .setName(FrogDto.getName())
                .setBirthDay(FrogDto.getBirthDay())
                .setId(UUID.randomUUID().toString())
                .setCreatedAt(LocalDateTime.now());

        return FrogRepository.save(Frog);
    }

    public Iterable<Frog> getAll() {
        return FrogRepository.findAll();
    }
}
