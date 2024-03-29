/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Measurement;
import io.swagger.model.MeasurementSummary;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.Sensor;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@Api(value = "sensors", description = "the sensors API")
public interface SensorsApi {

    @ApiOperation(value = "Add a new measurement for the specified sensor.", nickname = "addMeasurement", notes = "Add a new measurement for the specified sensor into the persistent store.", authorizations = {
        @Authorization(value = "weather_service_auth")    }, tags={ "Measurements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Accepted") })
    @RequestMapping(value = "/sensors/{sensorId}/measurements",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addMeasurement(@ApiParam(value = "The measurement to store." ,required=true )  @Valid @RequestBody Measurement body,@ApiParam(value = "The ID of the sensor which is reporting the measurement.",required=true) @PathVariable("sensorId") String sensorId);


    @ApiOperation(value = "Get the measurements for the specified sensor.", nickname = "getMeasurements", notes = "Get the measurements within the specified time range for the sensor. If no time range is supplied the default behaviour will be to return the measurements for the previous 24 hours.", response = Measurement.class, responseContainer = "List", authorizations = {
        @Authorization(value = "weather_service_auth")    }, tags={ "Measurements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = Measurement.class, responseContainer = "List") })
    @RequestMapping(value = "/sensors/{sensorId}/measurements",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Measurement>> getMeasurements(@ApiParam(value = "The ID of the sensor to which the measurement relates.",required=true) @PathVariable("sensorId") String sensorId,@ApiParam(value = "The timestamp for the beginning of the date range to get the measurements for (in format YYYY-MM-DDTHH:mm:ssZ or YYYY-MM-DDTHH:mm:ss.sssZ, matching the date-time format as specified by RFC 3339). If not specified will default to 24 hours before the toDate parameter.") @Valid @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate,@ApiParam(value = "The timestamp for the end of the date range to get the measurements for (in format YYYY-MM-DDTHH:mm:ssZ or YYYY-MM-DDTHH:mm:ss.sssZ, matching the date-time format as specified by RFC 3339). If not specified will default to now.") @Valid @RequestParam(value = "toDate", required = false) OffsetDateTime toDate);


    @ApiOperation(value = "Gets the list of sensors.", nickname = "getSensors", notes = "Gets details of all the sensors which have provided measurements.", response = Sensor.class, responseContainer = "List", authorizations = {
        @Authorization(value = "weather_service_auth")    }, tags={ "Sensors", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = Sensor.class, responseContainer = "List") })
    @RequestMapping(value = "/sensors",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Sensor>> getSensors();


    @ApiOperation(value = "Get a summary of measurements for the specified sensor.", nickname = "getSummaryMeasurements", notes = "Get a summary (e.g. minimum, maximum, average) of the measurements within the specified time range for the sensor. If no time range is supplied the default behaviour will be to return the measurements for the previous 24 hours.", response = MeasurementSummary.class, authorizations = {
        @Authorization(value = "weather_service_auth")    }, tags={ "Measurements", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = MeasurementSummary.class) })
    @RequestMapping(value = "/sensors/{sensorId}/measurements/summary",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<MeasurementSummary> getSummaryMeasurements(@ApiParam(value = "The ID of the sensor to which the measurement summary relates.",required=true) @PathVariable("sensorId") String sensorId,@ApiParam(value = "The timestamp for the beginning of the date range to get the measurement summary for (in format YYYY-MM-DDTHH:mm:ssZ or YYYY-MM-DDTHH:mm:ss.sssZ, matching the date-time format as specified by RFC 3339). If not specified will default to 24 hours before the toDate parameter.") @Valid @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate,@ApiParam(value = "The timestamp for the end of the date range to get the measurement summary for (in format YYYY-MM-DDTHH:mm:ssZ or YYYY-MM-DDTHH:mm:ss.sssZ, matching the date-time format as specified by RFC 3339). If not specified will default to now.") @Valid @RequestParam(value = "toDate", required = false) OffsetDateTime toDate);

}
