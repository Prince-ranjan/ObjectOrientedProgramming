public interface TwoDimentationShap {
    double calculatePerimeter();

    default double calculateAreaOfPoint() {
        return 0.0;
    }
    // default, static
}
