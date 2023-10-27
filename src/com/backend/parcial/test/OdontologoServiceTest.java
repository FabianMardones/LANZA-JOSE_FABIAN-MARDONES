package com.backend.parcial.test;

import com.backend.parcial.dao.impl.OdontologoIDaoH2;
import com.backend.parcial.dao.impl.OdontologoIDaoMemory;
import com.backend.parcial.model.Odontologo;
import com.backend.parcial.service.OdontologoService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoIDaoH2());

    @BeforeAll
    static void deBefore(){
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:~/c1parcial;INIT=RUNSCRIPT FROM 'create.sql'";
            String username = "sa";
            String password = "sa";
            connection = DriverManager.getConnection(url, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }
    }


    @Test
    void deberiaRetornarLosRegistrosPersistidosH2(){
        odontologoService = new OdontologoService(new OdontologoIDaoH2());
        Odontologo odontologoAPersistir = new Odontologo("Jose", "Lanza", 1234567);

        Odontologo odontologoPersistido = odontologoService.registrarOdontolog(odontologoAPersistir);

        assertNotNull(odontologoPersistido.getId());
    }
    @Test
    void deberiaRetornarLosRegistrosPersistidosEnMemoria(){
        odontologoService = new OdontologoService(new OdontologoIDaoMemory(new ArrayList<>()));
        Odontologo odontologoAPersisitr = new Odontologo("Fabian","Mardones",123456789);
        Odontologo odontologoPersisitdo = odontologoService.registrarOdontolog(odontologoAPersisitr);

        assertNotNull(odontologoPersisitdo.getId());
    }
}