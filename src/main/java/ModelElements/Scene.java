package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    //неверно описан конструктор вначале второго семинара показывал как нужно
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    // TODO: реализовать метод method1
    public <Type> Type method1(Type type) {
        return type;
    }

    // TODO: реализовать метод method2
    public <Type> Type method2(Type type1, Type type2) {
        return type1;
    }
}
