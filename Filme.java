/*
 * "Filme" class extends "Video" abstract class,
 * "Herança" requirement being concluded.
 */

public class Filme extends ArquivodeVideo {

    // Attributes

    private boolean featureFilm;

    // Methods

        // Gettes

        public boolean getFFilm() {
            return featureFilm;
        }

        // Setters

        public void setFFilm(boolean featureFilm) {
            this.featureFilm = featureFilm;
        }


}