package core.behavioralpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("img1", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("img2", new PngCompressor(), new HighContrastFilter());
    }
}
