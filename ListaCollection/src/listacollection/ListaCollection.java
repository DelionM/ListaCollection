package listacollection;
import java.util.Collections;
import java.util.LinkedList;
public class ListaCollection {

    public static void main(String[] args) {
        LinkedList List = new LinkedList();  
        List.add("Introducción a las Tecnologías de la Información\n");
        List.add("Aprender a Aprender\n");
        List.add("Desarrollo Sustentable y Medio Ambiente\n");
        List.add("Programa Institucional de Actividades Artísticas y Culturales\n");
        List.add("Fundamentos de Metodología de la Investigación\n");
        
        LinkedList List2 = new LinkedList();
        List2.add("Probabilidad y Estadística\n");
        List2.add("Administración de las TI\n");
        List2.add("Electricidad y Magnetismo\n");
        List2.add("Fundamentos de Programación\n");
        List2.add("Fundamentos de Redes\n ");
        
        LinkedList List3 = new LinkedList();
        List3.add("Precálculo\n");
        List3.add("Análisis y Diseño de Sistemas \n");
        List3.add("Diseño de Bases de Datos \n");
        List3.add("Programación Estructurada Avanzada \n");
        List3.add("Seguridad en Redes de Información \n");
        List3.add("Eventos Pasados y Futuros. Lengua Extranjera \n");
        
        LinkedList List4 = new LinkedList ();
        List4.add("Cálculo Diferencial e Integral \n");
        List4.add("Matemáticas Discretas\n");
        List4.add("Sistemas Electrónicos II\n");
        List4.add("Estructura de datos\n");
//        System.out.println("Materias que tengo riego de reprobación en 4to semestre");
//        System.out.println(List4.get(4));
//        System.out.println("Perdoneme profe");
       //Toma de datos aleatorios con shuffle
        Collections.shuffle(List4); 
        
        LinkedList List5 = new LinkedList();
        List5.add("Modelado en UML\n");
        List5.add("Métodos Numéricos \n");
        List5.add("Lenguajes y Autómatas\n ");
        List5.add("Estructura de Datos\n");
        
        LinkedList List6 = new LinkedList();
        List6.add("Administración de Proyectos para las TI \n");
        List6.add("Sistemas Operativos\n ");
        List6.add("Algoritmos Avanzados \n");
        List6.add("Desarrollo de Aplicaciones Móviles\n");
        
        LinkedList List7 = new LinkedList();
        List7.add("Evaluación de Proyectos para TI \n");
        List7.add("Cómputo en la Nube \n");
        List7.add("Minería de Datos\n ");
        List7.add("Internet de las Cosas\n");
        
        LinkedList List8 = new LinkedList();
        List8.add("Proyecto Terminal\n");
        List8.add("Servicio Social\n");
        List8.add("Preparación para Certificación en Lengua Extranjera\n");
        
        LinkedList List9= new LinkedList();
        List9.add("Prácticas Profesionales");
        
        System.out.println("--------------------------- Programa educativo LTI ESTI--------------------------");
        System.out.println("Primer semestre");
        System.out.println(List);
        System.out.println("La cantidad de Materias del semestre es:" + List.size());
        //                           usos de métodos optener primero y ultimo y posición en especifico
        System.out.println(List.getFirst());
        System.out.println(List.getLast());
        System.out.println(List.get(3));
        System.out.println("Segundo semestre");
        System.out.println(List2);
        System.out.println("La cantidad de Asignaturas del semestre 2 es:" + List2.size());
        System.out.println("Tercer semestre");
        System.out.println(List3);
        System.out.println("La cantidad de Asignaturas del semestre 3 es:" + List3.size());
        System.out.println("Cuarto semestre");
        System.out.println(List4);
        System.out.println("La cantidad de Asignaturas del semestre 4 es:" + List4.size());
       
        System.out.println("Quinto semestre");
        System.out.println(List5);
        System.out.println("La cantidad de Asignaturas del semestre 5 es:" + List5.size());
        System.out.println("Sexto semestre");
        System.out.println(List6);
        System.out.println("La cantidad de Asignaturas del semestre 6 es:" + List6.size());
        System.out.println("Septimo semestre");
        System.out.println(List7);
        System.out.println("La cantidad de Asignaturas del semestre 7 es:" + List7.size());        
        System.out.println("octavo semestre");
        System.out.println(List8);
        System.out.println("La cantidad de Asignaturas del semestre 8 es:" + List8.size());
        System.out.println("Noveno semestre");
        System.out.println(List9);
        System.out.println("La cantidad de Asignaturas del semestre 9 es:" + List9.size());
        
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Materias que hemos aprovado y en las que estamos actualmente cursando");
        //UNIR DOS LINKEDLIST 
        List.addAll(List2);
        List.addAll(List3);
        List.addAll(List4);
        System.out.println(List);
        System.out.println("Las materias que nos faltan por cursar para ser Lic xD");
        List5.addAll(List6);
        List5.addAll(List7);
        List5.addAll(List8);
        List5.addAll(List9);
        System.out.println(List5);
        
        System.out.println("---------------------------------------------------------------------------");
        //uso de remove borrar list 
        System.out.println("Eliminacion de una lista dentro de la lista 1 ");
        List.remove(List4);
        System.out.println(List);
        List.remove(List3);
        List.remove(List2);
        List5.remove(List9);
        List5.remove(List8);
        List5.remove(List7);
        List5.remove(List6);
    }
    
}
