
package pe.edu.cientifica.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author docente
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {
    private int codigo;
    private String nombres;
    private String apellidos;

}
