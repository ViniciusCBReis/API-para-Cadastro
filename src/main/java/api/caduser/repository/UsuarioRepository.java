package api.caduser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.caduser.datasourceModel.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
