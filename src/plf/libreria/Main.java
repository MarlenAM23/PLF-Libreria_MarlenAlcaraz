package plf.libreria;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //-----------------Inaugurando Librerias--------------------------------
        Libreria libreria = new Libreria("Libreria Marlen");

        //------------------Agregando vendedores-------------------------------
        Vendedor vendedor1 = new Vendedor("Marlen", "Alcaraz Malagon", Sexo.MUJER);
        Vendedor vendedor2 = new Vendedor("Olga", "Malagon", Sexo.MUJER);
        Vendedor vendedor3 = new Vendedor("Julio", "Zavala", Sexo.HOMBRE);

        libreria.agregarVendedor(vendedor1);
        libreria.agregarVendedor(vendedor2);
        libreria.agregarVendedor(vendedor3);
        
        
        System.out.println("--------------------------------------------------");

        // ---------------Agregando Libros------------------
        //Libro 1
        Autor autor = new Autor("Ana", "Frank", Sexo.MUJER, LocalDate.of(1920, Month.MARCH, 12));

        Libro libro1 = new Libro("El diario de Ana Frank", "PLANETA", "Ed.2022", autor, "123456789011122", 1945);

        libreria.agregarLibro(libro1);

        //Libro 2
        Libro libro2 = new Libro("Memorias de una Geisha",
                " Alfred A. Knopf",
                "Ed.2005",
                new Autor("Arthur", "Golden", Sexo.HOMBRE, LocalDate.of(1997, Month.SEPTEMBER, 27)),
                "123584597568489",
                1997);

        //Libro 3
        Libro libro3 = new Libro("Ana Vestida de Sangre",
                "Alfaguara Juvenil",
                "Ed.2013",
                new Autor("Kendare", "Blake", Sexo.MUJER, LocalDate.of(1981, Month.JULY, 17)),
                "587925185964258",
                2013);

        //Libro 4
        Libro libro4 = new Libro("Prohibido enamorarse de Adam Walker",
                "Nova Casa Editorial",
                "Ed.2020",
                new Autor("Lia", "Belikov", Sexo.MUJER, LocalDate.of(1998, Month.JULY, 23)),
                "897458003025690",
                1998);

        //Libro 5
        Libro libro5 = new Libro("Misery",
                "Penguin Random House",
                "Ed.1990",
                new Autor("Stephen", "King", Sexo.HOMBRE, LocalDate.of(1987, Month.JUNE, 8)),
                "217890145903258",
                1987);

        //Libro 6
        Libro libro6 = new Libro("Al final de la calle 118",
                "PLATAFORMA NEO",
                "Ed.2015",
                new Autor("Clara", "Cortes", Sexo.MUJER, LocalDate.of(2015, Month.JUNE, 8)),
                "036975012589425",
                2018);

        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);
        libreria.agregarLibro(libro4);
        libreria.agregarLibro(libro5);
        libreria.agregarLibro(libro6);
        
        System.out.println("-------------------------------------------");

        libreria.imprimirAcervo();
        libreria.imprimirVendedores();
        
        System.out.println("----------------------------------------------");

        // --------------Agregando Ventas--------------------------
        //Ventas del Vendedor 1
        Venta venta1 = new Venta(vendedor1, libro6, 1, 500.0);
        vendedor1.registrarVenta(venta1);
        vendedor1.registrarVenta(new Venta(vendedor1, libro4, 2, 450.0));

        //Ventas del Vendedor 2
        Venta venta2 = new Venta(vendedor2, libro3, 2, 900.0);
        vendedor2.registrarVenta(venta2);
        vendedor2.registrarVenta(new Venta(vendedor2, libro1, 1, 500.0));

        //Ventas del Vendedor 3
        Venta venta3 = new Venta(vendedor3, libro5, 1, 800.0);
        vendedor1.registrarVenta(venta3);
        vendedor1.registrarVenta(new Venta(vendedor3, libro2, 2, 1200.0));
        
        System.out.println("---------------------------------------------");

        libreria.imprimirTotalDeUnidadesVendidas();
        
        System.out.println("---------------------------------------------");
        
        libreria.imprimirTitulosMayusDesdeAnio(1950);
        
        System.out.println("----------------------------------------------");
        
        libreria.imprimirNombreCompletoVendedoresPorSexo(Sexo.OTRO);
        
        System.out.println("-----------------------------------------------");
        
        libreria.imprimirLibrosEnFormatoTituloISBN();
        
        System.out.println("-----------------------------------------------");
        
        List<Libro> libros = libreria.obtenerLibrosVendidosPor(vendedor3);
        libros.stream().forEach((System.out::print));
        
        System.out.println("-------------------------------------------------");
        
        libreria.imprimirVentasPorTituloYCantidad();
        
        System.out.println("--------------------------------------------------");
        
        libreria.obtenerAutorOrdenadosPorEdad();
        
        
      
        
        

    }

}
