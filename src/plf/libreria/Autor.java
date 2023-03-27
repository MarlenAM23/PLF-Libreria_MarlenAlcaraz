package plf.libreria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 *
 * @author LMC Alumno
 */
public class Autor {
    private String nombre;
    private String apellidos;
    private Sexo sexo;
    private LocalDate fechaNac;

    public Autor(String nombre, String apellidos, Sexo sexo, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }
    
    public int getEdad(){
        return (int) ChronoUnit.YEARS.between(fechaNac, LocalDate.now());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellidos);
        hash = 23 * hash + Objects.hashCode(this.sexo);
        hash = 23 * hash + Objects.hashCode(this.fechaNac);
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
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        return Objects.equals(this.fechaNac, other.fechaNac);
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", fechaNac=" + fechaNac + '}';
    }
    
    
    
    

}
