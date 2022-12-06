public class NetflixTeste {
    
    public static void main(String[] args) {
        
        Cliente Jefferson = new Cliente();
        Filme LotR = new Filme();
        Series PinkPanther = new Series();
        
        /*"Polimorfismo";
         * "Interface";
         * Requeirements being used!
         * 
         * 1 - The Cliente class is passing by Usuario!
         * 2 - The obligation of subscriptionPlan method of Usuario interface has been satisfied!
         */

        Jefferson.subscriptionPlan("Básico");

        // Setting normal methods
        Jefferson.setName("Jefferson");
        
        // Applying "Herança" in Filmes!
        LotR.setTitle("Senhor dos Anéis - A batalha dos cinco exércitos");
        LotR.setDescription("Um filme perfeito porém tem de ter tempo para assisti-lo!");
        LotR.setDuration("3 horas");

        // Setting normal methods
        LotR.setFFilm(true);


        // Applying "Herança" on the Series class!
        PinkPanther.setTitle("O show da pantera cor de rosa");
        PinkPanther.setDescription("Desenho muito bom, sem mimimi e sem palavras!");
        PinkPanther.setDuration("6 minutos");
        
        // Setting normal methods
        PinkPanther.setEpisodes(82);
        PinkPanther.setSeasons(4);

        System.out.println("O usuário "+Jefferson.getName()+" assistiu o filme "+LotR.getTitle()+" com "+LotR.getDuration()+" de duração");
        System.out.println("O usuário "+Jefferson.getName()+" assistiu a série "+PinkPanther.getTitle()+" com "+PinkPanther.getEpisodes()+" episódios, "+PinkPanther.getSeasons()+" temporadas e "+PinkPanther.getDuration()+" de duração!");
        System.out.println("O plano de "+Jefferson.getName()+" é "+Jefferson.plan);

    }

}
