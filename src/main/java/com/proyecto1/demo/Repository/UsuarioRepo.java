package com.proyecto1.demo.Repository;

import com.proyecto1.demo.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
