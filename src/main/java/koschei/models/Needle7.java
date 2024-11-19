package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private Deth8 deth;  // Поле для инъекции

    @Autowired
    public Needle7(Deth8 deth) {  // Конструктор инъекции
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( ";
    }

    // Также можно добавить сеттер, чтобы показать возможность сеттерной инъекции
    @Autowired
    public void setDeth(Deth8 deth) {  // Сеттер инъекции
        this.deth = deth;
    }
}