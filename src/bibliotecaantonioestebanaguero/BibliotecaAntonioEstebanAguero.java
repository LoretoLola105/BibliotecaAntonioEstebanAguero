/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaantonioestebanaguero;

import  bibliotecaantonioestebanaguero.AccesoADatos.LibroData;
import newpackageEntidades.Libro;


/**
 *
 * @author Otras
 */
public class BibliotecaAntonioEstebanAguero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //   Connection con = Conexion.getConexion();
//METODO GUARDAR LIBRO 
       /* Libro orgullo = new Libro("Orgullo y Prejuicio Zombie", "Jane Austen" , "Novela Romantica" , "T. Egerton, Whitehall", true);
        LibroData lib = new LibroData();
        lib.guardarLibro(orgullo);*/

// EL METODO FUNCIONA GUARDA EL LIBRO ORGULLO Y PREJUICIO idLibro  22
        //***********************************************************************************************************************************
//METODO BUSCAR LIBRO POR idISBN 

       /* LibroData lib=new LibroData();
       Libro libroEncontrado=lib.buscarLibro(2);
      if(libroEncontrado!=null){//para que no muestre el nullpointerexception
        System.out.println("Titulo: "+libroEncontrado.getTitulo());
        System.out.println("Autor: "+libroEncontrado.getAutor());
        System.out.println("Editorial: "+libroEncontrado.getEditorial());*/
//RESULTADO ENCUENTRA AL LIBRO CON ID (2): run: Titulo: Cien años de soledad, Autor: Gabriel Garcia Marquez, Editorial: Sudamericana.
//************************************************************************************************************************++  
//METODO BUSCAR LIBRO POR TITULO 

        /* LibroData lib=new LibroData();
       Libro libroEncontrado=lib.buscarLibroPorTitulo("orgullo y prejuicio");
      if(libroEncontrado!=null){//para que no muestre el nullpointerexception
        System.out.println("Titulo: "+libroEncontrado.getTitulo());
        System.out.println("Autor: "+libroEncontrado.getAutor());
        System.out.println("Editorial: "+libroEncontrado.getEditorial());*/
//RESULTADO ENCUENTRA AL LIBRO CON TITULO (orgullo y prejuicio): 
//run: Titulo: orgullo y prejuicio, Autor: Jane Austen, Editorial: T. Egerton, Whitehall, BUILD SUCCESSFUL (total time: 3 seconds)
//************************************************************************************************************       

            //METODO BUSCAR LIBRO POR GENERO CIENCIA FICCION
             
         /*  LibroData lib = new LibroData();
        String generoBuscado = "ciencia";
        Libro libroEncontrado = lib.buscarLibroPorGenero(generoBuscado);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: ");
            System.out.println("Título: " + libroEncontrado.getTitulo());
            System.out.println("Autor: " + libroEncontrado.getAutor());
            System.out.println("Editorial: " + libroEncontrado.getEditorial());  
            System.out.println("--------------------------------------------------------");
        }*/

 ////RESULTADO ENCUENTRA AL LIBRO CON CIENCIA FICCION run: Libro encontrado: Título: Los juegos del hambreAutor: Suzanne Collins Editorial: Scholastic BUILD SUCCESSFUL (total time: 3 seconds)
  

        //************************************************************************************************************   

//METODO LISTAR LIBROS LIBRO
//MUESTRA LA LISTA DE LIBROS ACTIVOS
       /* LibroData lib = new LibroData();
        for (Libro libro : lib.listarLibro()) {
            System.out.println(libro.getIsbn());
            System.out.println(libro.getTitulo());
            System.out.println(libro.getAutor());
            System.out.println(libro.getGenero());
            System.out.println(libro.getEditorial());
            System.out.println("--------------------");
        }*/

// RESULTADO EXITOSO MUESTRA A LOS LIBROS ACTIVOS run: 1, 1984, George Orwell, 1949, novela Distopía, Secker & Warburg ;
// 2, Cien años de soledad, Gabriel Garcia Marquez, 1967, Realismo Magico, Sudamericana; 3, Matar a un ruiseñor, Harper Lee, 1960, Novela, J.B. Lippincott & Co.
// 4, El gran Gatsby, F. Scott Fitsgerald, 1925, Ficcion Moderna, Charles Scribners Sons; 5, En busca del tiempo Perdido, Marcel Proust, 1913, Novela, Varios editores
//6, Crimen y Castigo, Fyodor Dostoevsky, 1866, Novela Psicologica, The Russian Messenger; 7, Ulises, James Joyce, 1922, Novela Modernista, Sylvia Beach
//8, Moby-Dick, Herman Melville, 1851, Novela de aventuras, Harper & Brothers; 9, Sobre Heroes y Tumbas, Ernesto Sabato, 1961, Novela, Compañía General Fabril Editora
//10, Ceremonia Secreta, Marco Denevi, 1977, Novela, Sudamericana;12, El corazon de las tinieblas, Joseph Conrad, 1899, Novela corta, Blackwoods Magazine; 13, Orgullo y Prejuicio, 
//Jane Austen, 1813, Novela Romantica, T. Egerton, Whitehall; 14, Orgullo y Prejuicio, Jane JANE Austen, 1813, Novela Romantica Britanica, T. Egerton, Whitehall BUILD SUCCESSFUL (total time: 3 seconds)

 //************************************************************************************************************ 
//METODO LISTAR LIBROS POR GENERO SE BUSCA EL GENERO "NOVELA"
//MUESTRA LA LISTA DE LIBROS ACTIVOS CON GENERO NOVELA
        /*LibroData lib = new LibroData();
        for (Libro libro : lib.listarLibrosPorGenero("novela")) {
            System.out.println("idLibro:"+libro.getIsbn());
            System.out.println("Titulo: "+libro.getTitulo());
            System.out.println("Autor: "+libro.getAutor());
            System.out.println("Genero: "+libro.getGenero());
            System.out.println("Editorial: "+libro.getEditorial());
            System.out.println("--------------------");
        }*/

//  RESULTADO run: idLibro:3, Titulo: Matar a un ruiseñor, Autor: Harper Lee, Genero: Novela, Editorial: J.B. Lippincott & Co; idLibro:5, Titulo: En busca del tiempo perdido, Autor: Marcel Proust
//Genero: Novela, Editorial: Varios Editores; idLibro:6, Titulo: Crimen y castigo, Autor: Fyodor Dostoevsky, Genero: Novela Psicologica, Editorial: The Russian Messenger; idLibro:7, Titulo: Ulises
//Autor: James Joyce, Genero: Novela Modernista, Editorial: Sylvia Beach; idLibro:8, Titulo: Moby-Dick, Autor: Herman Melville, Genero: Novela de Aventuras, Editorial: Harper & Brothers
//idLibro:9, Titulo: El corazon de las tinieblas, Autor: Joseph Conrad, Genero: Novela Corta, Editorial: Blackwoods Magazine; idLibro:10, Titulo: Orgullo y Prejuicio, Autor: Jane JANE Austen
//Genero: Novela Romantica Britanica, Editorial: T. Egerton, Whitehall; idLibro:13, Titulo: Crónica de una muerte anunciada, Autor: Gabriel Garcia Marquez, Genero: Novela, Editorial: Editorial La Oveja Negra
//idLibro:17, Titulo: Don Quijote de la Mancha, Autor: Francisco de Robles, Genero: Novela Clasica, Editorial: Miguel de Cervantes; idLibro:20, Titulo: El extranjero, Autor: Albert Camus, Genero: Novela filosofica
//Editorial: Gallimard; idLibro:21, Titulo: El amor en los tiempos del colera, Autor: Gabrile Garcia Marquez, Genero: Novela, Editorial: Oveja Negra; idLibro:22, Titulo: Orgullo y Prejuicio Zombie
//Autor: Jane Austen, Genero: Novela Romantica, Editorial: T. Egerton, Whitehall BUILD SUCCESSFUL (total time: 4 seconds)
 
//*****************************************************************************************************************************************

  //METODO LISTAR LIBROS POR AUTOR
  
  //METODO LISTAR LIBROS SE BUSCA EL AUTOR "gabriel garcia marquez"
//MUESTRA LA LISTA DE LIBROS ACTIVOS CON GENERO NOVELA

           /*LibroData lib = new LibroData();
        for (Libro libro : lib.listarLibrosPorAutor("gabriel garcia marquez")) {
            System.out.println("idLibro:"+libro.getIsbn());
            System.out.println("Titulo: "+libro.getTitulo());
            System.out.println("Autor: "+libro.getAutor());
            System.out.println("Genero: "+libro.getGenero());
            System.out.println("Editorial: "+libro.getEditorial());
            System.out.println("--------------------");
        }*/

//RESULTADO EXITOSO run: idLibro:2, Titulo: Cien años de soledad, Autor: Gabriel Garcia Marquez, Genero: Realismo Magico, Editorial: Sudamericana; idLibro:13, Titulo: Crónica de una muerte anunciada
//Autor: Gabriel Garcia Marquez, Genero: Novela, Editorial: Editorial La Oveja Negra BUILD SUCCESSFUL (total time: 3 seconds)

//*************************************************************************************************************************************************
  //METODO LISTAR LIBROS POR LA  EDITORIAL
  
  //METODO LISTAR LIBROS SE BUSCA LA EDITORIAL "sudamericana"
//MUESTRA LA LISTA DE LIBROS ACTIVOS CON GENERO NOVELA
        
        /*  LibroData lib = new LibroData();
        for (Libro libro : lib.listarLibrosPorEditorial("sudamericana")) {
            System.out.println("idLibro:"+libro.getIsbn());
            System.out.println("Titulo: "+libro.getTitulo());
            System.out.println("Autor: "+libro.getAutor());
            System.out.println("Genero: "+libro.getGenero());
            System.out.println("Editorial: "+libro.getEditorial());
            System.out.println("--------------------");
        }*/

        //RESULTADO EXITOSO run: idLibro:2, Titulo: Cien años de soledad, Autor: Gabriel Garcia Marquez, Genero: Realismo Magico, Editorial: Sudamericana; idLibro:18, Titulo: Rayuela
//Autor: Julio Cortazar, Genero: Ficcion Experimental, Editorial: Sudamericana BUILD SUCCESSFUL (total time: 3 seconds)

//******************************************************************************************************************

//METODO MODIFICAR LIBRO

        /*Libro orgullo = new Libro(10, "Orgullo y Prejuicio", "Jane JANE Austen" , "Novela Romantica Britanica" , "T. Egerton, Whitehall", true);
        LibroData lib = new LibroData();
        lib.modificarLibro(orgullo);*/
        //ALUMNO MODIFICADO EXITOSAMENTE SE LE ADICIONO "Jane JANE Austen" EN EL idISBN 14      
      
 //************************************************************************************************************       
  
 //METODO ELIMINAR LIBRO
         
        /*Libro orgullo = new Libro("Orgullo y Prejuicio Zombie", "Jane Austen" , "Novela Romantica" , "T. Egerton, Whitehall", true);
        LibroData lib = new LibroData();
        lib.eliminarLibro(22);*/
     
 //ELIMINA EXITOSAMENTE LIBRO idLibro (22) 
 //***********************************************************************************************************************************
   //*************************************************************************************************************************************************

//PROCEDIMIENTO PARA GUARDAR EJEMPLAR 

      /* Ejemplar ejemplar = new Ejemplar();
    ejemplar.setCantidadEjemplares(5); // Establecer la cantidad de ejemplares
    ejemplar.setEstado(true); // Establecer el estado del ejemplar
    // Establecer el idIsbn del libro al que deseas asociar este ejemplar
    int idIsbn = 21; 
    EjemplarData ejeData = new EjemplarData();
    ejeData.guardarEjemplar(ejemplar, idIsbn);*/
    
//RESULTADO METODO FUNCIONA GUARDAR Ejemplar       
////******************************************************************************************************* 
//    Prestamo p=new Prestamo();
//    PrestamoData pr=new PrestamoData();
//    pr.registrarPrestamo(LocalDate.of(2023, Month.SEPTEMBER, 23),LocalDate.of( 2023, Month.OCTOBER,05), "orgullo y prejuicio", 13));
//    
//    
//PrestamoData prestamoData = new PrestamoData();
//
//    // Supongamos que tienes instancias de Ejemplar y Lector
//    Ejemplar ejemplar = new Ejemplar(); // Asegúrate de configurar este objeto con los datos necesarios
//    Lector lector = new Lector(); // Asegúrate de configurar este objeto con los datos necesarios
//
//    // Supongamos que tienes las fechas de inicio y fin necesarias
//    Date fechaInicio = new Date(); // Fecha actual
//    Date fechaFin = new Date(); // Fecha actual + algún período de tiempo
//
//    // Llama al método registrarPrestamo y verifica el resultado
//    boolean exito = prestamoData.registrarPrestamo(ValueOf(2023-09-16), (2023-10-01),"Orgullo yt prejuicio", 13);
//
//    if (exito) {
//        System.out.println("El préstamo se registró exitosamente.");
//    } else {
//        System.out.println("No se pudo registrar el préstamo.");
//    }
}
 }

    

    
    

