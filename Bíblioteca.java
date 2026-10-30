package EmprestimoDeLivrosNaBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Bíblioteca {
   private final List<Livro> livros = new ArrayList<>();

    public void cadastrar(Livro livro) {
        if (livro == null) {
            throw new IllegalArgumentException("O livro não pode ser nulo.");
        }
        livros.add(livro);
    }

    public Livro buscarPorTitulo(String titulo) {
        if (titulo == null) {
            return null;
        }
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public boolean emprestar(String titulo) {
        Livro livro = buscarPorTitulo(titulo);
        return livro != null && livro.emprestar();
    }

    public boolean devolver(String titulo) {
        Livro livro = buscarPorTitulo(titulo);
        return livro != null && livro.devolver();
    }

    public List<Livro> listarDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

}
