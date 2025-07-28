import java.util.*;

public class Blog {
    private Set<Post> posts = new TreeSet<>();

    public void adicionarPostagem(Post post) {
        if (posts.contains(post)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();
        for (Post post : posts) {
            contagem.put(post.getCategoria(), contagem.getOrDefault(post.getCategoria(), 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();
        for (Post post : posts) {
            if (post.getAutor().equals(autor)) {
                postsPorAutor.add(post);
            }
        }
        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsPorCategoria = new TreeSet<>();
        for (Post post : posts) {
            if (post.getCategoria() == categoria) {
                postsPorCategoria.add(post);
            }
        }
        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategorias = new TreeMap<>();
        for (Post post : posts) {
            postsPorCategorias
                    .computeIfAbsent(post.getCategoria(), k -> new TreeSet<>())
                    .add(post);
        }
        return postsPorCategorias;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<>();
        for (Post post : posts) {
            postsPorAutor
                    .computeIfAbsent(post.getAutor(), k -> new TreeSet<>())
                    .add(post);
        }
        return postsPorAutor;
    }
}