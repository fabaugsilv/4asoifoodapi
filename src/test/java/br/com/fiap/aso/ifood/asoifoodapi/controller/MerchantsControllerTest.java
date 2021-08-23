package br.com.fiap.aso.ifood.asoifoodapi.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.fiap.aso.ifood.asoifoodapi.dto.MerchantDto;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MerchantsControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testFindAll() throws Exception {

		String url = "http://localhost:" + port + "/ifood/merchant/v1.0/merchants";

		ResponseEntity<MerchantDto[]> responseEntity = this.restTemplate.getForEntity(url, MerchantDto[].class);
		MerchantDto[] merchantDtos = responseEntity.getBody();

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

		assertNotNull(merchantDtos);
		assertEquals(5, merchantDtos.length);

		for (MerchantDto merchantDto : merchantDtos) {
			assertNotNull(merchantDto.getId());
			assertNotNull(merchantDto.getName());
			assertNotNull(merchantDto.getCorporateName());
		}

	}

}
