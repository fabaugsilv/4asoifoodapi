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

import br.com.fiap.aso.ifood.asoifoodapi.dto.MerchantDetailDto;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MerchantsControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testFindAll() throws Exception {

		String url = "http://localhost:" + port + "/ifood/merchant/v1.0/merchants";

		ResponseEntity<MerchantDetailDto[]> responseEntity = this.restTemplate.getForEntity(url,
				MerchantDetailDto[].class);
		MerchantDetailDto[] merchantDtos = responseEntity.getBody();

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

		assertNotNull(merchantDtos);
		assertEquals(4, merchantDtos.length);

		for (MerchantDetailDto merchantDto : merchantDtos) {
			assertNotNull(merchantDto.getId());
			assertNotNull(merchantDto.getName());
			assertNotNull(merchantDto.getCorporateName());
		}

	}

	@Test
	public void testFindById() throws Exception {

		String url = "http://localhost:" + port + "/ifood/merchant/v1.0/merchants/1";

		ResponseEntity<MerchantDetailDto> responseEntity = this.restTemplate.getForEntity(url, MerchantDetailDto.class);
		MerchantDetailDto merchantDto = responseEntity.getBody();

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

		assertNotNull(merchantDto.getId());
		assertNotNull(merchantDto.getName());
		assertNotNull(merchantDto.getCorporateName());
		assertNotNull(merchantDto.getDescription());
		assertNotNull(merchantDto.getAverageTicket());
		assertNotNull(merchantDto.getExclusive());
		assertNotNull(merchantDto.getType());
		assertNotNull(merchantDto.getState());
		assertNotNull(merchantDto.getCreatedAt());
		assertNotNull(merchantDto.getCountry());
		assertNotNull(merchantDto.getState());
		assertNotNull(merchantDto.getCity());
		assertNotNull(merchantDto.getPostalCode());
		assertNotNull(merchantDto.getDistrict());
		assertNotNull(merchantDto.getStreet());
		assertNotNull(merchantDto.getNumber());
		assertNotNull(merchantDto.getLatitude());
		assertNotNull(merchantDto.getLongitude());

	}

	@Test
	public void testFindByIdNotFound() throws Exception {

		String url = "http://localhost:" + port + "/ifood/merchant/v1.0/merchants/12";
		ResponseEntity<MerchantDetailDto> responseEntity = this.restTemplate.getForEntity(url, MerchantDetailDto.class);
		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());

	}

}
