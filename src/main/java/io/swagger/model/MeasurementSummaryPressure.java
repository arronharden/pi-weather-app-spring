package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MeasurementTypePressureWithTimestamp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MeasurementSummaryPressure
 */
@Validated
public class MeasurementSummaryPressure   {
  @JsonProperty("average")
  private Double average = null;

  @JsonProperty("latest")
  private MeasurementTypePressureWithTimestamp latest = null;

  @JsonProperty("minimum")
  private MeasurementTypePressureWithTimestamp minimum = null;

  @JsonProperty("maximum")
  private MeasurementTypePressureWithTimestamp maximum = null;

  public MeasurementSummaryPressure average(Double average) {
    this.average = average;
    return this;
  }

  /**
   * Get average
   * @return average
  **/
  @ApiModelProperty(value = "")

  public Double getAverage() {
    return average;
  }

  public void setAverage(Double average) {
    this.average = average;
  }

  public MeasurementSummaryPressure latest(MeasurementTypePressureWithTimestamp latest) {
    this.latest = latest;
    return this;
  }

  /**
   * Get latest
   * @return latest
  **/
  @ApiModelProperty(value = "")

  @Valid
  public MeasurementTypePressureWithTimestamp getLatest() {
    return latest;
  }

  public void setLatest(MeasurementTypePressureWithTimestamp latest) {
    this.latest = latest;
  }

  public MeasurementSummaryPressure minimum(MeasurementTypePressureWithTimestamp minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * Get minimum
   * @return minimum
  **/
  @ApiModelProperty(value = "")

  @Valid
  public MeasurementTypePressureWithTimestamp getMinimum() {
    return minimum;
  }

  public void setMinimum(MeasurementTypePressureWithTimestamp minimum) {
    this.minimum = minimum;
  }

  public MeasurementSummaryPressure maximum(MeasurementTypePressureWithTimestamp maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * Get maximum
   * @return maximum
  **/
  @ApiModelProperty(value = "")

  @Valid
  public MeasurementTypePressureWithTimestamp getMaximum() {
    return maximum;
  }

  public void setMaximum(MeasurementTypePressureWithTimestamp maximum) {
    this.maximum = maximum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasurementSummaryPressure measurementSummaryPressure = (MeasurementSummaryPressure) o;
    return Objects.equals(this.average, measurementSummaryPressure.average) &&
        Objects.equals(this.latest, measurementSummaryPressure.latest) &&
        Objects.equals(this.minimum, measurementSummaryPressure.minimum) &&
        Objects.equals(this.maximum, measurementSummaryPressure.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, latest, minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementSummaryPressure {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
