package ps.ja15.Entregable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ps.ja15.Entregable.model.Cuenta;
import ps.ja15.Entregable.service.CuentaService;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {
    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    public List<Cuenta> findByAll(){
        try {
            return cuentaService.findByAll();
        } catch (Exception e){
            return null;
        }


    }

    @GetMapping("/{id}")
    public Cuenta obtenerCuentaPorId(@PathVariable Long id) {
        try {
            return cuentaService.findById(id).orElse(null);
        } catch (Exception e) {
            return null;
        }
    }

        @PostMapping
        public Cuenta crearCuenta (@RequestBody Cuenta cuenta){
        try{
            return cuentaService.save(cuenta);
        }catch (Exception e){
            return null;
        }
        }


        @PutMapping
        public Cuenta actualizarCuenta (@RequestBody Cuenta cuenta){
        try{
            return cuentaService.update(cuenta);
        }catch (Exception e) {
            return null;
        }
        }

        @DeleteMapping("/{id}")
        public void eliminarCuenta (@PathVariable String numCuenta){
        try{
            cuentaService.delete(numCuenta);
        }catch (Exception e){

        }

        }
    }
