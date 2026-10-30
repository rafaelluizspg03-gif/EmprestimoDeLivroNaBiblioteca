package EmprestimoDeLivrosNaBiblioteca;

public class Main {
    public static void main(String[] args){
        Bíblioteca biblioteca = new Bíblioteca();
        biblioteca.cadastrar(new Livro("Clean Code", "Robert C. Martin"));
        biblioteca.cadastrar(new Livro("Effective Java", "Joshua Bloch"));
        biblioteca.cadastrar(new Livro("Use a Cabeça! Java", "Kathy Sierra"));

        System.out.println("Primeiro empréstimo: " + biblioteca.emprestar("Clean Code"));
        System.out.println("Segundo empréstimo: " + biblioteca.emprestar("Clean Code"));
        System.out.println("Devolução: " + biblioteca.devolver("Clean Code"));

        System.out.println("Livros disponíveis:");
        for (Livro livro : biblioteca.listarDisponiveis()) {
            System.out.println("- " + livro.getTitulo());
        }

    }
}
