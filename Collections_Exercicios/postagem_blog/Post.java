public class Post implements Comparable<Post> {
    private String titulo;
    private Autor autor;
    private Categorias categoria;

    public Post(String titulo, Autor autor, Categorias categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compareTo(Post outro) {
        return this.titulo.compareTo(outro.titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Post post = (Post) obj;
        return titulo.equals(post.titulo) && autor.equals(post.autor);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() + autor.hashCode();
    }
}