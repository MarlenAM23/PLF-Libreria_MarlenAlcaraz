package plf.libreria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author LMC Alumno
 */
public class Libreria {

    private String nombre;
    private List<Libro> acervo;
    private List<Vendedor> vendedores;

    public Libreria(String nombre) {
        this.nombre = nombre;
        acervo = new ArrayList<>();
        vendedores = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getAcervo() {
        return acervo;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public boolean agregarLibro(Libro lib) {
        return acervo.add(lib);

    }

    public boolean agregarVendedor(Vendedor ven) {
        return vendedores.add(ven);
    }

    public void imprimirAcervo() {
        acervo.stream()
                .forEach((Libro libro) -> {
                    System.out.println(libro);
                });
    }

    public void imprimirVendedores() {
        vendedores.stream()
                .forEach(System.out::println);
    }

    public void imprimirTotalDeUnidadesVendidas() {
        int total = vendedores.stream()
                .map(vendedor -> vendedor.getVentas())
                .flatMap(ventas -> ventas.stream())
                .map(venta -> venta.getCantidad())
                .reduce((a,b)-> a+b)
                .get();
        System.out.println("Total de unidades vendidas: " + total);
    }

    public void imprimirNombreCompletoVendedoresPorSexo(Sexo sexo) {
                vendedores.stream()
                .filter(vendedor -> vendedor.getSexo() == sexo)
                .map(Vendedor::getNombreCompleto)
                .forEach(System.out::println);
    }

    public void imprimirTitulosMayusDesdeAnio(int anio) {
        acervo.stream()
                .filter(libro -> libro.getAnio() >= anio)
                .forEach(libro -> System.out.println(libro.getTitulo().toUpperCase()));

        //.filter(libro -> libro.getAnio()>=anio)
        //.map(Libro::getTitulo)
        //.map(String::toUpperCase)
        //forEach(System.out::println);
    }

    public void imprimirLibrosEnFormatoTituloISBN() {
        acervo.stream()
                .map(libro -> libro.getTitulo() + "(" + libro.getIsbn() + ")")
                .forEach(System.out::println);
    }
    
    
    public List<Libro>librosMayoresAlAnio(int anio){
                return acervo.stream()
                    .filter(libro -> libro.getAnio()> anio)
                    .sorted(Comparator.comparing(Libro::getAnio))
                    .collect(Collectors.toList());
    }
    
    public List<Libro> obtenerLibrosVendidosPor(Vendedor vendedor){
        List result = vendedores.stream()
                .filter(vend -> vend.equals(vendedor))
                .flatMap(vend ->vend.getVentas().stream())
                .map(venta -> venta.getLibro())
                .collect(Collectors.toList());
        return result;
    }
    
    public void imprimirVentasPorTituloYCantidad(){
        vendedores.stream()
                .map(vendedor -> vendedor .getVentas())
                .flatMap(ventas -> ventas.stream())
                .map(venta -> venta.getLibro().getTitulo() + venta.getCantidad())
                .forEach(System.out::println);
    }
    
    public List<Autor> obtenerAutorOrdenadosPorEdad(){
        return acervo.stream()
                .map(libro ->libro.getAutor())
                .sorted(Comparator.comparing(Autor::getEdad))
                .collect(Collectors.toList());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.acervo);
        hash = 53 * hash + Objects.hashCode(this.vendedores);
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
        final Libreria other = (Libreria) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.acervo, other.acervo)) {
            return false;
        }
        return Objects.equals(this.vendedores, other.vendedores);
    }
            

    @Override
    public String toString() {
        return "Libreria{" + "nombre=" + nombre + ", acervo=" + acervo + ", vendedores=" + vendedores + '}';
    }

}
