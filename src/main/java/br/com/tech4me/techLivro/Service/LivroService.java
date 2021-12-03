package br.com.tech4me.techLivro.Service;

import java.util.List;
import br.com.tech4me.techLivro.model.Livro;

public interface LivroService {
    List<Livro> obterLivros();
    Livro cadastrarLivros(Livro livros);
    Livro obterLivroPorcodigo(Double codigo);
    void excluirCarro(Double codigo);
    Livro atualizarCarro(Double codigo, Livro novoLivro);
    Livro atualizarLivros(Double codigo, Livro novoLivro);
    
}
