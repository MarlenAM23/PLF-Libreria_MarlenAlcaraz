package plf.libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LMC Alumno
 */
public class Vendedor {

    private String nombre;
    private String apellidos;
    private Sexo sexo;
    private List<Venta> ventas;

    public Vendedor(String nombre, String apellidos, Sexo sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.ventas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public boolean registrarVenta(Venta venta) {
        return ventas.add(venta);
    }

    public String getNombreCompleto() {
        return nombre + "" + apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.apellidos);
        hash = 17 * hash + Objects.hashCode(this.sexo);
        hash = 17 * hash + Objects.hashCode(this.ventas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        return Objects.equals(this.ventas, other.ventas);
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", ventas=" + ventas + '}';
    }

}
