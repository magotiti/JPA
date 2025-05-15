package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IAcervoRepository {
    List<Livro> getLivros();
    Livro getLivroId(long id);
}