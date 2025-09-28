package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Student
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-23T12:25:11.085886700+05:30[Asia/Calcutta]")
public class Student {

  @JsonProperty("branch")
  private String branch;

  @JsonProperty("address")
  @Valid
  private List<Address> address = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("percent")
  private Float percent;

  @JsonProperty("rollno")
  private Integer rollno;

  public Student branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
  */
  
  @Schema(name = "branch", required = false)
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public Student address(List<Address> address) {
    this.address = address;
    return this;
  }

  public Student addAddressItem(Address addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public List<Address> getAddress() {
    return address;
  }

  public void setAddress(List<Address> address) {
    this.address = address;
  }

  public Student name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student percent(Float percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Get percent
   * @return percent
  */
  
  @Schema(name = "percent", required = false)
  public Float getPercent() {
    return percent;
  }

  public void setPercent(Float percent) {
    this.percent = percent;
  }

  public Student rollno(Integer rollno) {
    this.rollno = rollno;
    return this;
  }

  /**
   * Get rollno
   * @return rollno
  */
  
  @Schema(name = "rollno", required = false)
  public Integer getRollno() {
    return rollno;
  }

  public void setRollno(Integer rollno) {
    this.rollno = rollno;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.branch, student.branch) &&
        Objects.equals(this.address, student.address) &&
        Objects.equals(this.name, student.name) &&
        Objects.equals(this.percent, student.percent) &&
        Objects.equals(this.rollno, student.rollno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, address, name, percent, rollno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    rollno: ").append(toIndentedString(rollno)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

