package br.com.tech4me.techLivro.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.techLivro.model.Livro;

public interface LivroRepository extends MongoRepository<Livro, String> {

    Object findAll(Double codigo);

    void deleteById(Double codigo);

    
}