package com.example.controlaccesos.modelo;

import java.util.List;
import lombok.Data;

@Data
public class Usuario {
    private String userName;
    private String nombre;
    private String apellido;
    private boolean habilitado;
    private List<Acceso> accesos;
/*Implementar lo necesario para que se pueda obtener, 
dado un valor N en minutos, 
la lista de los usuarios que han accedido al sistema más de N minutos 
(teniendo en cuenta todos los accesos realizados) 
y que además estén habilitados. */
    public long getTotalMinutosAcceso() {
        // Si recorro los accesos del usuario obtengo el total de minutos de accesos
        long total = 0;
        for (Acceso a : accesos) {
            //por cada acceso tengo el total de accesos en minutos  
            total += a.getDuracionEnMinutos();
        }
        return total;
    }

    public boolean cumpleCondicionAcceso(int minutos) {
        
        return this.habilitado && this.getTotalMinutosAcceso() > minutos;
    }
}

