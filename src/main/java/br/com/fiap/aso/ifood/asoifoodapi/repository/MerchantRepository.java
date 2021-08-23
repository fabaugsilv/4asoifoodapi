package br.com.fiap.aso.ifood.asoifoodapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.aso.ifood.asoifoodapi.domain.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {

}
