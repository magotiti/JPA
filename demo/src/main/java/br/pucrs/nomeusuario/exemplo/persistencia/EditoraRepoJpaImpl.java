package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class EditoraRepoJpaImpl implements IEditoraRepository {
    private IEditoraJpaItfRep repository;

    @Autowired
    public EditoraRepoJpaImpl(IEditoraJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Editora> getEditoras() {
        List<Editora> editoras = repository.findAll();
        if (editoras.size() == 0) {
            return new LinkedList<Editora>();
        } else {
            return editoras.stream()
                         .toList();
        }
    }

    @Override
    public Editora getEditoraCodigo(long codigo) {
        Editora editora = repository.findById(codigo);
        return editora;
    }

    @Override
    public boolean addEditora(Editora editora) {
        if(repository.save(editora) != null)
            return true;
        return false;
    }    

}