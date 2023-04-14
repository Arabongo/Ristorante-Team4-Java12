public class SecondiPiatti {
        private String name;
        private double price;

        public SecondiPiatti(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public double getPrice() {
        return price;
        }

        public void setNome(String name) {
            this.name = name;
        }

        public void setPrice(Double price) {this.price = price;}
}
