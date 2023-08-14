package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<IModelChangedObserver> changedObservers) {
        this.changedObservers = changedObservers;
        models = new ArrayList<>();
        scenes = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
        //и в каждый список нужно добавить по элементу, об этом на говорит связь между объектами
    }

    // TODO: реализовать метод scene
    public Scene getScene(int id) {
        return new Scene(id, models, flashes);
    }

    // TODO: реализовать метод notifyChange
    @Override
    public void notifyChange(IModelChanger sender) {
    }
}
