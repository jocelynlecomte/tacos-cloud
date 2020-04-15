package tacos;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IngredientTest {

    @Test
    public void shouldDeserialize() throws Exception {
        String json = "{\"id\":\"FLTO\",\"name\":\"Flour Tortilla\",\"type\":\"WRAP\"}";
        Ingredient expected = new Ingredient("Flour Tortilla", Ingredient.Type.WRAP);
        ObjectMapper mapper = new ObjectMapper();
        Ingredient ingredient = mapper.readValue(json, Ingredient.class);
        assertThat(ingredient).isEqualTo(expected);
    }
}