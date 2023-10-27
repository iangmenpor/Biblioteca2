

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //-Libro

        System.out.println("----------------------LIBRO---------------------");
        Libro libro1 =new Libro();
        libro1.setAutor("Mary Alison");
        libro1.setIsbn("I12923298494X");
        libro1.setFechapublicacion("20/05/2008");
        libro1.setGenero("Fantasia");
        libro1.setTitulo("Harry potter");

        System.out.println("titulo: "+ libro1.getTitulo());
        System.out.println("ISBN: "+ libro1.getIsbn());
        System.out.println("Genero: "+ libro1.getGenero());
        System.out.println("Autor/a: "+ libro1.getAutor());
        System.out.println("Publicado en: "+ libro1.getFechapublicacion());


        //-Autor
        Autor autor1= new Autor();    //Datos inventados
        autor1.setNombre(libro1.getAutor());
        autor1.setApellidos("Smith");
        autor1.setLocalidadnacimiento("Michigan");
        autor1.setNacimiento("21 Febrero de 1990");

        System.out.println("-------------------INFO SOBRE AUTOR/A-----------");
        System.out.println("Nombre:"+ autor1.getNombre());
        System.out.println("Apellido: "+ autor1.getApellidos());
        System.out.println("Nacido/a en: "+ autor1.getLocalidadnacimiento() + " en "+ autor1.getNacimiento());

        //-Genero

        Genero genero1 = new Genero();
        genero1.setNombre(libro1.getGenero());
        genero1.setDescripcion("El género fantástico es un género artístico en el que hay presencia de elementos que rompen con la realidad establecida");

        System.out.println("-------------------GENERO---------------------");
        System.out.println("Genero: "+ genero1.getNombre());
        System.out.println("Descripción: "+ genero1.getDescripcion());

        //-Usuario
        Usuario usuario1 = new Usuario();
        usuario1.setDni("71300211T");
        usuario1.setDireccion("Av. Inmaculada,9,05005 Ávila");
        usuario1.setTelefono("+ 34 619 739 210");
        usuario1.setPoblacion("Ávila");
        usuario1.setNombre("Ian Gabriel");
        usuario1.setApellidos("Mendoza Portillo");

        System.out.println("------------------USUARIO-----------------------");
        System.out.println("Usuario: "+ usuario1.getNombre() +" "+ usuario1.getApellidos());
        System.out.println("DNI: "+ usuario1.getDni());
        System.out.println("Dirección: "+ usuario1.getDireccion());
        System.out.println("Población: "+ usuario1.getPoblacion());
        System.out.println("Contacto: "+ usuario1.getTelefono());


        //-Prestamo
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setLibro(libro1.getTitulo());
        prestamo1.setUsuario(usuario1.getNombre() +" "+ usuario1.getApellidos());
        prestamo1.setFechaprestamo("27/10/2023");
        prestamo1.setFechadevolucion("30/11/2023");

        System.out.println("-----------------PRESTAMO----------------------");
        System.out.println("Libro: "+ libro1.getTitulo());
        System.out.println("Autor/a: "+ autor1.getNombre() +" "+ autor1.getApellidos());
        System.out.println("Usuario:"+ usuario1.getNombre() +" "+  usuario1.getApellidos());
        System.out.println("Fecha de prestamo: "+ prestamo1.getFechaprestamo());
        System.out.println("Fecha devolución: "+ prestamo1.getFechadevolucion());


    }
    }