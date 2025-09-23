package com.example.stub.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StudentResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-23T12:25:11.085886700+05:30[Asia/Calcutta]")
public class StudentResult {

  @JsonProperty("marks")
  private Integer marks;

  @JsonProperty("exam")
  private String exam;

  @JsonProperty("rollno")
  private Integer rollno;

  public StudentResult marks(Integer marks) {
    this.marks = marks;
    return this;
  }

  /**
   * Get marks
   * @return marks
  */
  
  @Schema(name = "marks", required = false)
  public Integer getMarks() {
    return marks;
  }

  public void setMarks(Integer marks) {
    this.marks = marks;
  }

  public StudentResult exam(String exam) {
    this.exam = exam;
    return this;
  }

  /**
   * Get exam
   * @return exam
  */
  
  @Schema(name = "exam", required = false)
  public String getExam() {
    return exam;
  }

  public void setExam(String exam) {
    this.exam = exam;
  }

  public StudentResult rollno(Integer rollno) {
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
    StudentResult studentResult = (StudentResult) o;
    return Objects.equals(this.marks, studentResult.marks) &&
        Objects.equals(this.exam, studentResult.exam) &&
        Objects.equals(this.rollno, studentResult.rollno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marks, exam, rollno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentResult {\n");
    sb.append("    marks: ").append(toIndentedString(marks)).append("\n");
    sb.append("    exam: ").append(toIndentedString(exam)).append("\n");
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

