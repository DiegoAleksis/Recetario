import java.util.ArrayList;

public class Recetario {
private ArrayList<Receta>recetas;
private String autor, titulo;

    public Recetario(ArrayList<Receta> recetas, String autor, String titulo) {
        this.recetas = recetas;
        this.autor = autor;
        this.titulo = titulo;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarRecetario(){
        System.out.println(titulo);
        System.out.println(autor);

    }
}
