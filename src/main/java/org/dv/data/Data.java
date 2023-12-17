package org.dv.data;

import com.google.api.client.util.DateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import reactor.util.annotation.Nullable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "data")
public class Data {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String endYear;
  private float citylng;
  private float citylat;
  private Long intensity;
  private String sector;
  private String topic;
  private String insight;
  private String swot;
  private String url;
  private String region;
  private String startYear;
  private Long impact;
  @DateTimeFormat(pattern="MM/DD/YYYY HH:MM:SS AM/PM")
  private DateTime added;
  @DateTimeFormat(pattern="MM/DD/YYYY HH:MM:SS AM/PM")
  private DateTime published;
  private String city;
  private String country;
  private Long relevance;
  private String pestle;
  private String source;
  private String title;
  private Long likelihood;
}
