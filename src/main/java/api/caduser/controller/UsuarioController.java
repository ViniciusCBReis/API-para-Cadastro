package api.caduser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.caduser.exception.UsuarioNotFoundException;
import api.caduser.model.Usuario;
import api.caduser.resourceModel.UsuarioResource;
import api.caduser.service.BuscarPorIdService;
import api.caduser.service.BuscarTodosService;
import api.caduser.service.CadUsuario;

@RestController
@RequestMapping(value = "/userControl")
public class UsuarioController {

    @Autowired
    private BuscarTodosService serviceBuscar;

    @Autowired
    private CadUsuario serviceCadastro;

    @Autowired
    private BuscarPorIdService serviceBuscarPorId;

    @GetMapping(path = "/usuarios")
    public List<Usuario> buscarUser(){
        return serviceBuscar.buscarTodosUsuarios();
    }

    @GetMapping(path = "/usuario/id/{id}")
    public Usuario buscarUserPorId(
        @PathVariable(name = "id", required = true) Long id)
         throws UsuarioNotFoundException{
            return serviceBuscarPorId.buscarPorId(id);
    }

    @PostMapping(path = "/usuario/cadastro")
    public void cadastrarUsuario(@RequestBody UsuarioResource usuario){
        serviceCadastro.cadastro(usuario);
    }

    @DeleteMapping(path = "/usuario/delete/{id}")
    public void deleteUsuario(
        @PathVariable(name = "id", required = true) Long id)
         throws UsuarioNotFoundException{
            serviceBuscarPorId.deletarPorId(id);
    }
}
