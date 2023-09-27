package ufrn.br.tcc_anacamilly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "")
    @Size(min = 5)
    private String nome;

    @NotBlank(message = "")
    @Size(min = 5)
    private String username;

    @NotBlank(message = "")
    @Size(min = 5)
    private String senha;

    private String tipoUsuario;

}
