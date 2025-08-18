public class ProdutorConsumidor {
        public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // Criar e iniciar as threads do produtor e consumidor
        Thread produtorThread = new Thread(new Produtor(buffer));
        Thread consumidorThread = new Thread(new Consumidor(buffer));

        produtorThread.start();
        consumidorThread.start();

        try {
            produtorThread.join();
            consumidorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
