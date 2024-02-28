package api.caduser.resourceModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioResource {
    @JsonProperty("nome_usuario")
    private String nome;

    @JsonProperty("aniversario")
    private String aniversario;

    @JsonProperty("genero")
    private String genero;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("senha")
    private String senha;

    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getAniversario() {
        return aniversario;
    }


    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public UsuarioResource(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "UsuarioResource [nome=" + nome + ", aniversario=" + aniversario + ", genero=" + genero + ", email="
                + email + ", telefone=" + telefone + ", senha=" + senha + "]";
    }

    
}
