package tacos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingredient {

  public Ingredient() {
  }

  public Ingredient(String name, Type type) {
    this.name = name;
    this.type = type;
  }

  private String name;
  private Type type;

  public static enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}
