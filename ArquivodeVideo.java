public abstract class ArquivodeVideo {
    
    // Attributes
    
    private String duration;
    private String title;
    private String description;

    /* Methods
     * "Classe abstrata" created;
     * "Encapsulamento" of "Video" abstract class.
     */

        // Gettes

        public String getDuration() {
            return duration;
        }

        public String getTitle() {
            return title;
        }

        public String description() {
            return description;
        }

        // Setters

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDescription(String description) {
            this.description = description;
        }

}
