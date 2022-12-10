package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table( name = "usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    
    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<Rol> roles;
}
