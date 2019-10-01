package io.swagger.api;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.threeten.bp.OffsetDateTime;

import io.swagger.model.Measurement;
import io.swagger.model.MeasurementSummary;
import io.swagger.model.Sensor;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SensorsApiControllerIntegrationTest {

	@Autowired
	private SensorsApi api;

	@Test
	public void addMeasurementTest() throws Exception {
		Measurement body = new Measurement();
		String sensorId = "sensorId_example";
		ResponseEntity<Void> responseEntity = api.addMeasurement(body, sensorId);
		assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
	}

	@Test
	public void getMeasurementsTest() throws Exception {
		String sensorId = "sensorId_example";
		OffsetDateTime fromDate = OffsetDateTime.now();
		OffsetDateTime toDate = OffsetDateTime.now();
		ResponseEntity<List<Measurement>> responseEntity = api.getMeasurements(sensorId, fromDate, toDate);
		assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
	}

	@Test
	public void getSensorsTest() throws Exception {
		ResponseEntity<List<Sensor>> responseEntity = api.getSensors();
		assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
	}

	@Test
	public void getSummaryMeasurementsTest() throws Exception {
		String sensorId = "sensorId_example";
		OffsetDateTime fromDate = OffsetDateTime.now();
		OffsetDateTime toDate = OffsetDateTime.now();
		ResponseEntity<MeasurementSummary> responseEntity = api.getSummaryMeasurements(sensorId, fromDate, toDate);
		assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
	}

}
