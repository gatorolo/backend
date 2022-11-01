package com.proyecto1.demo.Controller;

import com.proyecto1.demo.Entity.Usuario;
import com.proyecto1.demo.Services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obtenerusuarioid(@PathVariable("id") Long id){
        Usuario usuario = usuarioService.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario updateUsuario=usuarioService.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
}
