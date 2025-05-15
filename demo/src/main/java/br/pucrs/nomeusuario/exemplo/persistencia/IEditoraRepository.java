package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IEditoraRepository {
    List<Editora> getEditoras();
    Editora getEditoraCodigo(long codigo);
    boolean addEditora(Editora editora);
}

