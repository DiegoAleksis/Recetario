import java.util.ArrayList;
import java.util.Arrays;

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
         new ArrayList<>(Arrays.asList("Preparar todo con los ingredientes", "Comer dormido")));

    }
}
