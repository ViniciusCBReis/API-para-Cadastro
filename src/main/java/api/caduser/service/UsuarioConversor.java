package api.caduser.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import api.caduser.datasourceModel.Usuario;
import api.caduser.exception.UsuarioResourceException;
import api.caduser.resourceModel.UsuarioResource;

@Component
public class UsuarioConversor {
    
    public Usuario conversor(UsuarioResource usuarioResource) throws UsuarioResourceException {
        try {
            Usuario user = new Usuario();

            LocalDate aniversario = checkAniversario(usuarioResource.getAniversario());

            user.setAniversario(aniversario);

            user.setSenha(usuarioResource.getNome());

            user.setEMAIL(usuarioResource.getEmail());

            user.setGenero(usuarioResource.getGenero());

            user.setNome(usuarioResource.getNome());

            user.setTelefone(usuarioResource.getTelefone());

            return user;

        } catch (Exception e){
            throw new UsuarioResourceException(
                "Falha ao converter o resource para entidade, resource: "+ usuarioResource);
        }
    }

    private LocalDate checkAniversario(String aniversario) {
        return LocalDate.parse(aniversario);
    }
}
