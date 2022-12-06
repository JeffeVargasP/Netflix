public class Cliente implements Usuario {

    // Attributes
    
    private String creditCard;
    private String name;
    private int age;
    private String CPF;
    public String plan;

    // Implement

    @Override
    public void subscriptionPlan(String plan) {
        this.plan = plan;
    }

    // Methods

        // Getters

        public String getCreditCard() {
            return creditCard;
        }

        public String getName() {
            return name;
        }

        public int getaAge() {
            return age;
        }

        public String getCPF() {
            return CPF;
        }

        // Seters

        public void setCreitCard(String number) {
            
            // Exceptions requirement
            if (number.length() < 16) {
                IllegalArgumentException erro = new IllegalArgumentException();
                throw erro;
            } else {
                this.creditCard = number;
            }
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int number) {
            
            // Exceptions requirement
            if (number < 18) {
                IllegalArgumentException erro = new IllegalArgumentException();
                throw erro;
            } else {
                this.age = number;
            }
        }

        public void setCPF(String number) {
            
            // Exceptions requirement
            if (number.length() < 11) {
                IllegalArgumentException erro = new IllegalArgumentException();
                throw erro;
            } else {
                this.CPF = number;
            
        }
    }
}