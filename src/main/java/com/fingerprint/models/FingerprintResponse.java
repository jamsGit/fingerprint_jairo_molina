package com.fingerprint.models;




import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FingerprintResponse implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = -6964993048198217583L;
  
  private String entityName;
  private Boolean success;


}
