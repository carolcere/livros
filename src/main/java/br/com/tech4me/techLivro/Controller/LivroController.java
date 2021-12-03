package br.com.tech4me.techLivro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.tech4me.techLivro.Service.LivroService;
import br.com.tech4me.techLivro.model.Livro;

@RequestMapping
@RestController("/api/tech4livro")
public class LivroController {
    @Autowired 
    private LivroService servico;
    
    public List<Livro> obterLivros(){
        return servico.obterLivros();
    }

    @GetMapping (value= "/{id}")
    public Livro obterLivroPorcodigo(@PathVariable Double codigo){
        return servico.obterLivroPorcodigo(codigo);
    }

    @PostMapping
    public ResponseEntity<Livro> cadastrarLivros(@RequestBody Livro livros){
        return new ResponseEntity<>(servico.cadastrarLivros(livros), HttpStatus.CREATED);
    }


    @DeleteMapping (value= "/{id}")
    public void excluirLivro(@PathVariable Double codigo){
        servico.excluirCarro(codigo);
    }

    @PutMapping(value= "/{id}")
    public Livro atualizarLivros( @PathVariable Double codigo, @RequestBody Livro novoLivro){
        return servico.atualizarLivros(codigo, novoLivro);
    }


    

    
}
