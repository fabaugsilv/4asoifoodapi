package br.com.fiap.aso.ifood.asoifoodapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.aso.ifood.asoifoodapi.dto.MerchantDetailDto;
import br.com.fiap.aso.ifood.asoifoodapi.dto.MerchantDto;
import br.com.fiap.aso.ifood.asoifoodapi.service.MerchantService;

@RestController
@RequestMapping("/merchant/v1.0")
public class MerchantController {

	@Autowired
	private MerchantService merchantService;

	@GetMapping("/merchants")
	public ResponseEntity<MerchantDto[]> findAll() {

		List<MerchantDto> merchants = merchantService.findAll();

		return new ResponseEntity<MerchantDto[]>(merchants.toArray(new MerchantDto[0]), HttpStatus.OK);

	}

	@GetMapping("/merchants/{id}")
	public ResponseEntity<MerchantDetailDto> findById(@PathVariable("id") Long id) {

		MerchantDetailDto merchant = merchantService.findById(id);

		if (merchant == null) {
			return new ResponseEntity<MerchantDetailDto>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<MerchantDetailDto>(merchant, HttpStatus.OK);

	}

}
