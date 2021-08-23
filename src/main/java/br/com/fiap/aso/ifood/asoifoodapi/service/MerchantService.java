package br.com.fiap.aso.ifood.asoifoodapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.aso.ifood.asoifoodapi.domain.Merchant;
import br.com.fiap.aso.ifood.asoifoodapi.dto.MerchantDetailDto;
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

	public MerchantDetailDto findById(Long id) {

		Optional<Merchant> optionalMerchant = merchantRepository.findById(id);
		if (!optionalMerchant.isPresent()) {
			return null;
		}

		Merchant merchant = optionalMerchant.get();

		MerchantDetailDto merchantDetailDto = new MerchantDetailDto();
		merchantDetailDto.setId(merchant.getId());
		merchantDetailDto.setName(merchant.getName());
		merchantDetailDto.setCorporateName(merchant.getCorporateName());
		merchantDetailDto.setDescription(merchant.getDescription());
		merchantDetailDto.setAverageTicket(merchant.getAverageTicket());
		merchantDetailDto.setExclusive(merchant.getExclusive());
		merchantDetailDto.setType(merchant.getType());
		merchantDetailDto.setState(merchant.getState());
		merchantDetailDto.setCreatedAt(merchant.getCreatedAt());
		merchantDetailDto.setCountry(merchant.getCountry());
		merchantDetailDto.setState(merchant.getState());
		merchantDetailDto.setCity(merchant.getCity());
		merchantDetailDto.setPostalCode(merchant.getPostalCode());
		merchantDetailDto.setDistrict(merchant.getDistrict());
		merchantDetailDto.setStreet(merchant.getStreet());
		merchantDetailDto.setNumber(merchant.getNumber());
		merchantDetailDto.setLatitude(merchant.getLatitude());
		merchantDetailDto.setLongitude(merchant.getLongitude());

		return merchantDetailDto;

	}

}
