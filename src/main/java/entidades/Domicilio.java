package entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Domicilio")
@Getter
@Setter
public class Domicilio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombrecalle")
    private String nombrecalle;
    @Column(name = "numero")
    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;

    public Domicilio() {
    }

    public Domicilio(String nombrecalle, int numero) {
        this.nombrecalle = nombrecalle;
        this.numero = numero;
    }

    public Domicilio(String nombrecalle, int numero, Cliente cliente) {
        this.nombrecalle = nombrecalle;
        this.numero = numero;
        this.cliente = cliente;
    }
}