package amaciag.springframework.springGuru.controllers;

import amaciag.springframework.springGuru.controllers.faux.FauxController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class FauxDevControllerTest {

    @Autowired
    FauxController fauxController;


    @Test
    void getDatasource() {
        System.out.println(fauxController.getDataSourceService());
    }
}