public class Series extends ArquivodeVideo {
    
    // Attributes

    int episodes;
    int seasons;

    // Methods

        // Gettes

        public int getEpisodes() {
            return episodes;
        }

        public int getSeasons() {
            return seasons;
        }

        // Setters

        public void setEpisodes(int number) {
            this.episodes = number;
        }

        public void setSeasons(int number) {
            this.seasons = number;
        }
}
