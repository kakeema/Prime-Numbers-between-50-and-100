class Main {
    public static void main(String[] args) {
        int i  = 50;
        boolean prime = false;
        while (i < 100) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    prime = true;
                }
                else {
                    prime = false;
                    break;
                }
            }
            if(prime == true) {
                System.out.println(i);
            } 
            i++;
        }
    }
}