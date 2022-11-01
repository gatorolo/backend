package com.proyecto1.demo.Services;
import com.proyecto1.demo.Entity.Usuario;
import com.proyecto1.demo.Exception.UserNotFoundException;
import com.proyecto1.demo.Repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }


    public Usuario agregarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> buscarUsuario(){
        return usuarioRepo.findAll();
    }
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }
    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(()->new UserNotFoundException("usuario no encontrado"));
    }
}
