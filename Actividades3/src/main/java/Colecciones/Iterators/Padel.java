package Colecciones.Iterators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Padel extends Pistas{

    private String paredes;

    public Padel (int id, String techado, String paredes){
        super(id,techado);
        this.paredes = paredes;
    }
}
