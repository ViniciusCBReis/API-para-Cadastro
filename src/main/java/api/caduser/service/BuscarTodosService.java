package api.caduser.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import api.caduser.model.Usuario;
import api.caduser.repository.UsuarioRepository;

@Service
public class BuscarTodosService {
    private static final Logger LOG = Logger.getLogger(BuscarTodosService.class.getName());

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List <Usuario> buscarTodosUsuarios(){
        LOG.info("Serviço de busca de todos os usuários está sendo executado");

        List<Usuario> ListaUsuarios = usuarioRepository.findAll();

    return ListaUsuarios;

    }
}
