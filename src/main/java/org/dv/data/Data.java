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
  @Nullable
  private String endYear;
  @Nullable
  private float citylng;
  @Nullable
  private float citylat;
  @Nullable
  private Long intensity;
  @Nullable
  private String sector;
  @Nullable
  private String topic;
  @Nullable
  private String insight;
  @Nullable
  private String swot;
  @Nullable
  private String url;
  @Nullable
  private String region;
  @Nullable
  private String startYear;
  @Nullable
  private Long impact;
  @Nullable
  @DateTimeFormat(pattern="MM/DD/YYYY HH:MM:SS AM/PM")
  private DateTime added;
  @Nullable
  @DateTimeFormat(pattern="MM/DD/YYYY HH:MM:SS AM/PM")
  private DateTime published;
  @Nullable
  private String city;
  @Nullable
  private String country;
  @Nullable
  private Long relevance;
  @Nullable
  private String pestle;
  @Nullable
  private String source;
  @Nullable
  private String title;
  @Nullable
  private Long likelihood;
}
