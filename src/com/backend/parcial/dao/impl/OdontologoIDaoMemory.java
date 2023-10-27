package com.backend.parcial.dao.impl;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoIDaoMemory implements IDao<Odontologo> {

    private final Logger LOGGER = Logger.getLogger(OdontologoIDaoMemory.class);

    private List<Odontologo> odontologoRepository;

    public OdontologoIDaoMemory(List<Odontologo> odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        int id = odontologoRepository.size() + 1;
        odontologoRepository.add(odontologo);
        Odontologo odontologoRegistrado = new Odontologo(id, odontologo.getNombre(), odontologo.getApellido(), odontologo.getNumeroDeMatricula());
        LOGGER.info("Odontologo registrado en memory: " + odontologoRegistrado);

        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        List<Odontologo> odontologos = new ArrayList<>();

        for (Odontologo odontologo : odontologoRepository) {

            Odontologo odontologoObtenido = new Odontologo(odontologo.getId(), odontologo.getNombre(), odontologo.getApellido(), odontologo.getNumeroDeMatricula());
            odontologos.add(odontologoObtenido);
            LOGGER.info("El Odontologo: " + odontologoObtenido + "Fue encontrado");
        }

        return odontologos;
    }

}
