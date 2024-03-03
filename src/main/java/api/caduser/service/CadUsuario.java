package api.caduser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.internal.Logger;

import api.caduser.exception.UsuarioResourceException;
import api.caduser.model.Usuario;
import api.caduser.repository.UsuarioRepository;
import api.caduser.resourceModel.UsuarioResource;

@Service
public class CadUsuario {
    private static final Logger LOG = Logger.getLogger(CadUsuario.class.getName());

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioConversor service;

    @SuppressWarnings("null")
    public void cadastro(UsuarioResource usuarioResource){
        try{

            Usuario resultado = service.conversor(usuarioResource);

            usuarioRepository.saveAndFlush(resultado);

        } catch (UsuarioResourceException e) {
            LOG.warn("Erro ao salvar usuario: "+ e.getMessage() + e);
        }
    }

}
