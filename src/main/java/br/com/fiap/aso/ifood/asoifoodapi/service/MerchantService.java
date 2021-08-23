package br.com.fiap.aso.ifood.asoifoodapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.aso.ifood.asoifoodapi.domain.Merchant;
import br.com.fiap.aso.ifood.asoifoodapi.dto.MerchantDto;
import br.com.fiap.aso.ifood.asoifoodapi.repository.MerchantRepository;

@Service
public class MerchantService {

	@Autowired
	private MerchantRepository merchantRepository;

	public List<MerchantDto> findAll() {

		List<Merchant> merchants = merchantRepository.findAll();

		List<MerchantDto> merchantDtos = new ArrayList<MerchantDto>();

		for (Merchant merchant : merchants) {
			merchantDtos.add(new MerchantDto(merchant.getId(), merchant.getName(), merchant.getCorporateName()));
		}

		return merchantDtos;

	}

}
