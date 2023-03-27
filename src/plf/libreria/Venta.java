package plf.libreria;

import java.util.Objects;

/**
 *
 * @author LMC Alumno
 */
public class Venta {
    private Vendedor vendedor;
    private Libro libro;
    private int cantidad;
    private double total;

    public Venta(Vendedor vendedor, Libro libro, int cantidad, double total) {
        this.vendedor = vendedor;
        this.libro = libro;
        this.cantidad = cantidad;
        this.total = total;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Libro getLibro() {
        return libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.vendedor);
        hash = 89 * hash + Objects.hashCode(this.libro);
        hash = 89 * hash + this.cantidad;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
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
        final Venta other = (Venta) obj;
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (!Objects.equals(this.vendedor, other.vendedor)) {
            return false;
        }
        return Objects.equals(this.libro, other.libro);
    }
    
    
    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", libro=" + libro + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
}
