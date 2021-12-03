package br.com.tech4me.techLivro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.tech4me.techLivro.Repository.LivroRepository;
import br.com.tech4me.techLivro.model.Livro;

@Service
public class LivroServiceImpl implements LivroService {
  @Autowired
  private LivroRepository repo;


  @Override 
  public List<Livro> obterLivros(){
      return repo.findAll();
  }
  
  @Override
  public Livro cadastrarLivros(Livro livros){
      return repo.save(livros);
  }


    @Override
    public Livro obterLivroPorcodigo(Double codigo) {
        return repo.findAll(codigo).get();
    }

    @Override
    public void excluirLivro(Double codigo) {
        repo.deleteById(codigo);
        
    }

    @Override
    public Livro atualizarLivro(Double codigo, Livro novoCodigo) {
        novoCodigo.setCodigo(codigo);
        return repo.save(novoCodigo);
    }

  
}
