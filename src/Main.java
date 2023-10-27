import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //-Libro

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce los datos sobre el Libro:");
        System.out.print("Titulo: ");
        String Titulo=sc.nextLine();
        System.out.print("Autor: ");
        String Autor=sc.nextLine();
        System.out.print("ISBN:");
        String ISBN=sc.nextLine();
        System.out.print("Fecha de publicación: ");
        String Fpublic=sc.nextLine();
        System.out.print("Genero: ");
        String genero=sc.nextLine();

        System.out.println("----------------------LIBRO---------------------");
        Libro libro1 =new Libro();
        libro1.setAutor(Autor);
        libro1.setIsbn(ISBN);
        libro1.setFechapublicacion(Fpublic);
        libro1.setGenero(genero);
        libro1.setTitulo(Titulo);

        System.out.println("titulo: "+ libro1.getTitulo());
        System.out.println("ISBN: "+ libro1.getIsbn());
        System.out.println("Genero: "+ libro1.getGenero());
        System.out.println("Autor/a: "+ libro1.getAutor());
        System.out.println("Publicado en: "+ libro1.getFechapublicacion());

        System.out.println("--------------------------------------------------");

        //-Autor

        System.out.println("Introduce los datos sobre el Autor/a:");
        System.out.print("Apellido: ");
        String Apell=sc.nextLine();
        System.out.print("Localidad de Nacimiento: ");
        String LNac=sc.nextLine();
        System.out.print("Fecha de Nacimiento: ");
        String Nac=sc.nextLine();

        Autor autor1= new Autor();
        autor1.setNombre(Autor);
        autor1.setApellidos(Apell);
        autor1.setLocalidadnacimiento(LNac);
        autor1.setNacimiento(Nac);

        System.out.println("-------------------INFO SOBRE AUTOR/A-----------");
        System.out.println("Nombre:"+ autor1.getNombre());
        System.out.println("Apellido: "+ autor1.getApellidos());
        System.out.println("Nacido/a en: "+ autor1.getLocalidadnacimiento() + " en "+ autor1.getNacimiento());
        System.out.println("------------------------------------------------");

        //-Genero

        System.out.println("Introduce una breve descripción: ");
        System.out.print("Descripción: ");
        String Descr=sc.nextLine();

        Genero genero1 = new Genero();
        genero1.setNombre(libro1.getGenero());
        genero1.setDescripcion(Descr);

        System.out.println("-------------------GENERO---------------------");
        System.out.println("Genero: "+ genero1.getNombre());
        System.out.println("Descripción: "+ genero1.getDescripcion());
        System.out.println("----------------------------------------------");

        //-Usuario

        System.out.println("Inicia Sesión por favor:");
        System.out.print("Nombre: ");
        String Name=sc.nextLine();
        System.out.print("Apellidos: ");
        String Apell2=sc.nextLine();
        System.out.print("DNI: ");
        String dni=sc.nextLine();
        System.out.print("Dirección: ");
        String Direcc=sc.nextLine();
        System.out.print("Población: ");
        String Poblac=sc.nextLine();
        System.out.print("Contacto:");
        String Cont=sc.nextLine();

        Usuario usuario1 = new Usuario();
        usuario1.setDni(dni);
        usuario1.setDireccion(Direcc);
        usuario1.setTelefono(Cont);
        usuario1.setPoblacion(Poblac);
        usuario1.setNombre(Name);
        usuario1.setApellidos(Apell2);

        System.out.println("------------------USUARIO-----------------------");
        System.out.println("Usuario: "+ usuario1.getNombre() +" "+ usuario1.getApellidos());
        System.out.println("DNI: "+ usuario1.getDni());
        System.out.println("Dirección: "+ usuario1.getDireccion());
        System.out.println("Población: "+ usuario1.getPoblacion());
        System.out.println("Contacto: "+ usuario1.getTelefono());
        System.out.println("---------------------------------------------------");



        //-Prestamo

        System.out.println("Por favor rellena los siguientes datos para realizar el prestamo de "+ libro1.getTitulo());
        System.out.print("Fecha de Prestamo: ");
        String Fprest=sc.nextLine();
        System.out.print("Fecha de devolución: ");
        String FDevol=sc.nextLine();

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setLibro(libro1.getTitulo());
        prestamo1.setUsuario(usuario1.getNombre() +" "+ usuario1.getApellidos());
        prestamo1.setFechaprestamo(Fprest);
        prestamo1.setFechadevolucion(FDevol);

        System.out.println("-----------------PRESTAMO----------------------");
        System.out.println("Libro: "+ libro1.getTitulo());
        System.out.println("Autor/a: "+ autor1.getNombre() +" "+ autor1.getApellidos());
        System.out.println("Usuario:"+ usuario1.getNombre() +" "+  usuario1.getApellidos());
        System.out.println("Fecha de prestamo: "+ prestamo1.getFechaprestamo());

        System.out.println("Fecha devolución: "+ prestamo1.getFechadevolucion());
        System.out.println("------------------------------------------------");
        System.out.println(" ");
        System.out.println("Disfrute! :)");

    }
    }