package api.caduser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.caduser.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
