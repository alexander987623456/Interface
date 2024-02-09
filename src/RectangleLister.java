public abstract class RectangleFilter implements RFilter<Rectangles> {
    @Override
    public boolean accept(Rectangles rectangles) {
        return rectangles.calcPerimeter() > 10;
    }
}