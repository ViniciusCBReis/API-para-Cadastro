package api.caduser.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.caduser.datasourceModel.Usuario;
import api.caduser.exception.UsuarioNotFoundException;
import api.caduser.repository.UsuarioRepository;

@Service
public class BuscarPorIdService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario buscarPorId (Long id)
     throws UsuarioNotFoundException{Optional<Usuario> optionalUsuario = getOptionalUsuario(id);

        Usuario user = null;
        if(!optionalUsuario.isPresent()){
         throw new UsuarioNotFoundException("Usuário não encontrado atrvés do ID :"+id);
        }else{
            user = optionalUsuario.get();
        }
        return user;
    }

    private Optional<Usuario> getOptionalUsuario(Long id) {
        Optional <Usuario> optionalUsuario = usuarioRepository.findById(id);
        return optionalUsuario;
    }

    @SuppressWarnings("null")
    public void deletarPorId(Long id)
     throws UsuarioNotFoundException{
        Optional<Usuario> optionalUsuario = getOptionalUsuario(id);
        if(!optionalUsuario.isPresent()){
            throw new UsuarioNotFoundException("Usuário não encontrado através do ID :"+id);
        }else{
            usuarioRepository.delete(optionalUsuario.get());
        }
     }
}
