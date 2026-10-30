package EmprestimoDeLivrosNaBiblioteca;

public class Livro {
    private final String titulo;
    private final String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        if (titulo == null || titulo.isBlank() || autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("Título e autor são obrigatórios.");
        }
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public boolean emprestar() {
        if (emprestado) {
            return false;
        }
        emprestado = true;
        return true;
    }

    public boolean devolver() {
        if (!emprestado) {
            return false;
        }
        emprestado = false;
        return true;
    }

}
