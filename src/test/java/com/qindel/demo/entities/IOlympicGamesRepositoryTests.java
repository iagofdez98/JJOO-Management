package com.qindel.demo.entities;

import com.qindel.demo.OlympicGamesApplication;
import com.qindel.demo.model.repositories.ISedeOlympicRepository;
import com.qindel.demo.model.vo.IOlympicGames;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(classes = OlympicGamesApplication.class)
@ExtendWith(SpringExtension.class)
public class IOlympicGamesRepositoryTests {

    @Autowired
    private ISedeOlympicRepository iJJOORepository;

    @Test
    public void TestRepositoryNotNull(){
        assertNotNull(iJJOORepository);
    }

    @Test
    public void TestFindByQueryVecesNotNull(){
        List<IOlympicGames> juegos = new ArrayList<>();

        iJJOORepository.findByQueryVeces().forEach(juegos::add);
        assertNotNull(juegos);
    }

    @Test
    public void TestFindByQueryVecesSize(){
        List<IOlympicGames> juegos = new ArrayList<>();

        iJJOORepository.findByQueryVeces().forEach(juegos::add);
        assertEquals(juegos.size(), iJJOORepository.findByQueryVeces().size());
    }
}
