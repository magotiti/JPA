package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IEditoraJpaItfRep extends CrudRepository<Editora,Long>{
    @SuppressWarnings("null")
    List<Editora> findAll(); 
    Editora findById(long codigo); 
    @SuppressWarnings({ "null", "unchecked" })
    Editora save(Editora editora);
}