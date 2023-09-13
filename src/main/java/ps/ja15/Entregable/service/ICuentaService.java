package ps.ja15.Entregable.service;

import ps.ja15.Entregable.model.Cuenta;

import java.util.List;
import java.util.Optional;

public interface ICuentaService {

    public Cuenta save(Cuenta cuenta) throws Exception;

    Cuenta update(Cuenta cuenta) throws Exception;

    void delete(String numeroDeCuenta) throws Exception;

    Cuenta findByNumberCount(String id)throws Exception;

    List<Cuenta> findByAll()throws Exception;

    public Optional <Cuenta> findById(Long id)throws Exception;
}