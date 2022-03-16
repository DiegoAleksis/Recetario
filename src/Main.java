import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double hotcakes;
        Ingrediente harina= new Ingrediente("Harina",false,300);
        Ingrediente leche= new Ingrediente("Leche",false,250);
        Ingrediente huevo= new Ingrediente("Huevo", true, 50);
        Ingrediente mantequilla= new Ingrediente("Mantequilla", false, 25);
        Ingrediente avena= new Ingrediente("Avena",false,150);

        ArrayList<Ingrediente> ingredientesdisponibles=new ArrayList<>();
ingredientesdisponibles.add(harina);
ingredientesdisponibles.add(leche);
ingredientesdisponibles.add(leche);
ingredientesdisponibles.add(huevo);
ingredientesdisponibles.add(mantequilla);
ingredientesdisponibles.add(avena);

 Receta hotca = new Receta("Hot cakes", 5,
         new ArrayList<>(Arrays.asList(harina,leche,huevo,mantequilla,avena)),
         new ArrayList<>
                 (Arrays.asList("Preparar la masa con todos los ingredientes",
                 "Vertir en un recipiente la mezcla",
                 "Calentar un sarten",
                 "Agregar una poca cantidad de la masa al sarten",
                 "Esperar la coccion necesaria para voltearlos")));

 Recetario Mirecetario = new Recetario(new ArrayList<>(Arrays.asList(hotca)),"Alexis",
         "Receta romantica");


        System.out.println("Bienvenido, elige una opción");
        System.out.println("1. Agregar un ingrediente nuevo");
        System.out.println("2. Agrgar una receta nueva");
        System.out.println("3. Ver mi recetatario");
        // pendiente opcion para salir
        Scanner scanner= new Scanner(System.in);
        int respuesta=1;
        respuesta=scanner.nextInt();

        switch (respuesta){
            case 1:
                Ingrediente nuevo= new Ingrediente();
                System.out.println("Ingrese el nombre del ingrediente");
                nuevo.setNombre(scanner.next());
                System.out.println("Ingrese la cantidad");
                nuevo.setPeso(scanner.nextDouble());
                System.out.println("¿Tu ingrediente es dulce o salado? 1. Si\t2. No");
                if (scanner.nextInt()==1){
                    nuevo.setEsSalado(true);
                }else{
                    nuevo.setEsSalado(false);
                }
                System.out.println("Ingrediente creado");
                ingredientesdisponibles.add(nuevo);
                break;
            case 2:
                Receta nueva=new Receta();
                System.out.println("Ingrese el nombre de la receta");
                nueva.setNombre(scanner.next());
                System.out.println("Ingrese el tiempo de preparacion");
                nueva.setTiempoPreparacion(scanner.nextDouble());
                System.out.println("Los ingredientes disponibles son: ");
                for (int i = 0; i < ingredientesdisponibles.size(); i++) {
                    System.out.println(i+1 + ". " + ingredientesdisponibles.get(i).getNombre());
                }
                ArrayList<Ingrediente>ingredientesReceta=new ArrayList<>();
                System.out.println("Ingrese el numero del ingrediente correspondiente y de enter,"+
                        "Si ya no quiere agregar mas escriba 0");
                do {
                    if(respuesta!=0){
                        ingredientesReceta.add(ingredientesdisponibles.get(respuesta-1));
                    }
                }while (respuesta!=0);
                nueva.setIngredientes(ingredientesReceta);
                break;
            case 3:
                break;
        }
    }
}
