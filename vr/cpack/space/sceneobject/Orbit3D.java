package vr.cpack.space.sceneobject;

import org.xith3d.scenegraph.*;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;

public class Orbit3D extends Group {

    public Orbit3D(Point3f [] orbitCoords) {
        addChild(new Shape3D(makeGeometry(orbitCoords), makeAppearance()));
    }

    LineStripArray makeGeometry(Point3f [] orbitCoords) {
        final LineStripArray orbitGeometry = new LineStripArray(orbitCoords.length, LineStripArray.COORDINATES, new int[]{orbitCoords.length});
        for (int i = 0; i < orbitCoords.length; i++)
            orbitGeometry.setCoordinate(i, orbitCoords[i]);
        return orbitGeometry;
    }

    Appearance makeAppearance() {
        final Appearance orbitAppearance = new Appearance();
        orbitAppearance.setLineAttributes(new LineAttributes(1f, LineAttributes.PATTERN_SOLID, true));
        orbitAppearance.setColoringAttributes(new ColoringAttributes(new Color3f(0f, 0.1f, 0.4f), ColoringAttributes.FASTEST));
        //        orbitAppearance.setColoringAttributes(new ColoringAttributes(new Color3f(0f, 0f, 1f), ColoringAttributes.FASTEST));
        return orbitAppearance;
    }
}
