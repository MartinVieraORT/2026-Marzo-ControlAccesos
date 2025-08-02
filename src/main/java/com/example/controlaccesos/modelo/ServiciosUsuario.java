package com.example.controlaccesos.modelo;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.Data;

@Data
@Service
public class ServiciosUsuario {
    private List<Usuario> usuarios;
}
