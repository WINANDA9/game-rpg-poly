class Hero extends Character {
   

    @Override
    public void move() {
        System.out.println( "Hero Bergerak ");
    }

    public void move(String direction) {
        System.out.println( "Hero Bergerak " + direction );
    }
}
