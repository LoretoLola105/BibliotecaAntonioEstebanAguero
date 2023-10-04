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
       /*  Libro orgullo = new Libro("Orgullo y Prejuicio Zombie", "Jane Austen" , 1813 , "Novela Romantica" , "T. Egerton, Whitehall", true);
        LibroData lib = new LibroData();
        lib.guardarLibro(orgullo);*/

// EL METODO FUNCIONA GUARDA EL LIBRO ORGULLO Y PREJUICIO idISBN 13
        //***********************************************************************************************************************************
//METODO BUSCAR LIBRO POR idISBN 

        /*LibroData lib=new LibroData();
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
//METODO MODIFICAR LIBRO

        /*Libro orgullo = new Libro(14, "Orgullo y Prejuicio", "Jane JANE Austen" , 1813 , "Novela Romantica Britanica" , "T. Egerton, Whitehall", true);
        LibroData lib = new LibroData();
        lib.modificarLibro(orgullo);*/
        //ALUMNO MODIFICADO EXITOSAMENTE SE LE ADICIONO "Jane JANE Austen" EN EL idISBN 14      
        //************************************************************************************************************   
//MUESTRA LA LISTA DE ALUMNOS ACTIVOS
       /* LibroData lib = new LibroData();
        for (Libro libro : lib.listarLibro()) {
            System.out.println(libro.getIsbn());
            System.out.println(libro.getTitulo());
            System.out.println(libro.getAutor());
            System.out.println(libro.getAnio());
            System.out.println(libro.getTipo());
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
  
 //METODO ELIMINAR LIBRO
         
       /* Libro orgullo = new Libro("Orgullo y Prejuicio Zombie", "Jane Austen" , 1813 , "Novela Romantica" , "T. Egerton, Whitehall", true);
        LibroData lib = new LibroData();
        lib.eliminarLibro(15);*/
     
 //ELIMINA EXITOSAMENTE LIBRO idISBN (15) 
 //***********************************************************************************************************************************
    }

    
    
}
