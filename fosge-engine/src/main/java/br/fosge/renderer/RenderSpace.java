package br.fosge.renderer;

public enum RenderSpace {
    /**
     * Local space is the coordinate space that is local to your object, i.e. where your object begins in.
     * Imagine that you've created your cube in a modeling software package (like Blender). The origin of
     * your cube is probably at (0,0,0) even though your cube may end up at a different location in your
     * final application. Probably all the models you've created all have (0,0,0) as their initial position.
     * All the vertices of your model are therefore in local space: they are all local to your object.
     */
    LOCAL,

    /**
     * If we would import all our objects directly in the application they would probably all be somewhere
     * positioned inside each other at the world's origin of (0,0,0) which is not what we want. We want to
     * define a position for each object to position them inside a larger world. The coordinates in world
     * space are exactly what they sound like: the coordinates of all your vertices relative to a (game) world.
     * This is the coordinate space where you want your objects transformed to in such a way that they're all
     * scattered around the place (preferably in a realistic fashion).
     */
    WORLD,

    /**
     * The view space is what people usually refer to as the camera of OpenGL (it is sometimes also known as camera
     * space or eye space). The view space is the result of transforming your world-space coordinates to coordinates
     * that are in front of the user's view. The view space is thus the space as seen from the camera's point of view.
     * This is usually accomplished with a combination of translations and rotations to translate/rotate the scene so
     * that certain items are transformed to the front of the camera. These combined transformations are generally
     * stored inside a view matrix that transforms world coordinates to view space. In the next chapter we'll
     * extensively discuss how to create such a view matrix to simulate a camera.
     */
    VIEW,

    /**
     * <p>
     * At the end of each vertex shader run, OpenGL expects the coordinates to be within a specific range and any
     * coordinate that falls outside this range is clipped. Coordinates that are clipped are discarded, so the remaining
     * coordinates will end up as fragments visible on your screen. This is also where clip space gets its name from.
     * </p>
     *
     * <p>
     * Because specifying all the visible coordinates to be within the range -1.0 and 1.0 isn't really intuitive, we
     * specify our own coordinate set to work in and convert those back to NDC as OpenGL expects them.
     * </p>
     *
     * <p>
     * To transform vertex coordinates from view to clip-space we define a so called projection matrix that specifies
     * a range of coordinates e.g. -1000 and 1000 in each dimension. The projection matrix then converts coordinates
     * within this specified range to normalized device coordinates (-1.0, 1.0) (not directly, a step called Perspective
     * Division sits in between). All coordinates outside this range will not be mapped between -1.0 and 1.0 and
     * therefore be clipped. With this range we specified in the projection matrix, a coordinate of (1250, 500, 750)
     * would not be visible, since the x coordinate is out of range and thus gets converted to a coordinate higher than
     * 1.0 in NDC and is therefore clipped.
     * </p>
     *
     * <p>
     * This viewing box a projection matrix creates is called a frustum and each coordinate that ends up inside this
     * frustum will end up on the user's screen. The total process to convert coordinates within a specified range to
     * NDC that can easily be mapped to 2D view-space coordinates is called projection since the projection matrix
     * projects 3D coordinates to the easy-to-map-to-2D normalized device coordinates.
     * </p>
     *
     * <p>
     * Once all the vertices are transformed to clip space a final operation called perspective division is performed
     * where we divide the x, y and z components of the position vectors by the vector's homogeneous w component;
     * perspective division is what transforms the 4D clip space coordinates to 3D normalized device coordinates.
     * This step is performed automatically at the end of the vertex shader step.
     * </p>
     *
     * <p>
     * It is after this stage where the resulting coordinates are mapped to screen coordinates (using the settings of
     * glViewport) and turned into fragments.
     * </p>
     *
     * <p>
     * The projection matrix to transform view coordinates to clip coordinates usually takes two different forms, where
     * each form defines its own unique frustum. We can either create an orthographic projection matrix or a perspective
     * projection matrix.
     * </p>
     */
    CLIP,
    SCREEN
}
