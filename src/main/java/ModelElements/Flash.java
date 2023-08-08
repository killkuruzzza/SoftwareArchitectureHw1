package ModelElements;

import Stuff.Angle3D;
import Stuff.Color;
import Stuff.Point3D;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    // TODO: реализовать метод rotate
    public void rotate(Angle3D angle) {
    }

    // TODO: реализовать метод move
    public void move(Point3D location) {
    }
}
