package Colecciones.Iterators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tenis extends Pistas{

    private String superficie;

    public Tenis (int id, String techado, String superficie){
        super(id,techado);
        this.superficie = superficie;
    }

}
