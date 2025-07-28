import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        postagens.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        for (Post post : postagens) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagemPorCategoria = new TreeMap<>();
        for (Post post : postagens) {
            contagemPorCategoria.put(post.getCategoria(),
            contagemPorCategoria.getOrDefault(post.getCategoria(), 0) + 1);
        }
        return contagemPorCategoria;
    }
}
