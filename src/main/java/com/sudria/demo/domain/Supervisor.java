package com.sudria.demo.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Builder
public class Supervisor {

  private Long identifiant;
  private String firstname;
  private String lastname;
  private String phoneNumber;
  private String emailAdsress;

}
