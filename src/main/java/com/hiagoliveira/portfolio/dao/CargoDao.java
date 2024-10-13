package com.hiagoliveira.portfolio.dao;

import java.util.List;

import com.hiagoliveira.portfolio.domain.Cargo;
import com.hiagoliveira.portfolio.util.PaginacaoUtil;

public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
    
    PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);
}
