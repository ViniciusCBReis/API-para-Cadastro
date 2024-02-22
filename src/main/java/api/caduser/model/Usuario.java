package api.caduser.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    private String Nome;
    private String EMAIL;
    private String Telefone; //Foi levado em consideração a inserção de (dd) ou o regional (+55)
    private String Senha; //Considerando senha Alfanumérica

    private LocalDate Aniversario;

    public Usuario(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String eMAIL) {
        EMAIL = eMAIL;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public LocalDate getAniversario() {
        return Aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        Aniversario = aniversario;
    }


    //Obs: Considere colocar um identificador de usuário e/ou um codigo de registro próprio ou por Autoincrement no banco de dados.


    
}
